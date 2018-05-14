#!/usr/bin/env bash
set -euo pipefail
IFS=$'\n\t'

rm -rf /tmp/tmp.*

TMP=$(mktemp -d)
DB_BASE="shapes.sqlite"
DB="$TMP/$DB_BASE"

tar -xjf raw-shapes/RuinedCastle2018Survey-export.tar.bz2 -C "$TMP"

echo "CHANGING SHAPE FILE PROJECTION..."
for filename in $TMP/data/*.shp; do
  echo "  - $filename"
  filenameProj="$filename.proj.shp"
  ogr2ogr -s_srs EPSG:28356 -t_srs EPSG:3857 "$filenameProj" "$filename" -lco ENCODING=UTF-8
done

for src in $TMP/data/*.proj.*; do
  ext="${src##*.}"
  noExt="${src%.*}"
  noExt="${noExt%.*}"
  noExt="${noExt%.*}"

  dst="$noExt.$ext"
  mv "$src" "$dst"
done

echo "IMPORTING SHAPE FILE INTO SPATIALITE DATABASE..."
for filename in $TMP/data/*.shp; do
  echo "  - $filename"

  noExt="${filename%.*}"
  base=$(basename "$noExt") # Used as table name

  spatialite_tool \
    -i \
    -shp "$noExt" \
    -d "$DB" \
    -t "$base" \
    -g Geometry \
    -c utf-8 \
    -s 3857
done

echo "ADDING SPATIAL INDEXES..."
for filename in $TMP/data/*.shp; do
  echo "  - $filename"

  noExt="${filename%.*}"
  base=$(basename "$noExt") # Used as table name

  spatialite "$DB" "SELECT CreateSpatialIndex('$base', 'Geometry');"
done

mv "$DB" "data/shapes/$DB_BASE"

rm -rf "$TMP"
