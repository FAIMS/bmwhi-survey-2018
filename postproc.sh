#!/usr/bin/env bash

bash ./raw-shapes/transform-to-database.sh

cd data
tar -hcvzf ../module/data.tar.gz * >/dev/null
cd ..

cd module

string="
        <select1 ref=\"Entity_Types\">
          <label>\{Entity_Types}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
replacement="
        <group ref=\"Colgroup_1\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Entity_Types\">
              <label>\{Entity_Types}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_User\">
              <label>\{Select_User}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_2\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Feature_Type\">
              <label>\{Feature_Type}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
        <\/group>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="
              <Entity_Types\/>"
replacement="
              <Colgroup_1>
                <Col_0>
                  <Entity_Types\/>
                <\/Col_0>
                <Col_1>
                  <Select_User\/>
                <\/Col_1>
                <Col_2>
                  <Feature_Type\/>
                <\/Col_2>
              <\/Colgroup_1>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="ref=\"Feature_ID\" faims_style_class=\"required\""
replacement="ref=\"Feature_ID\" faims_style_class=\"required-readonly\""
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="ref=\"Photographed_Feature_ID\" faims_style_class=\"required\""
replacement="ref=\"Photographed_Feature_ID\" faims_style_class=\"required-readonly\""
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

cat << EOF >> english.0.properties
Select_User=Select User
stopped=Stopped
time=Time
distance=Distance
EOF

cat << EOF >> ui_styling.css
.orange {
  background-color: orange;
}
.required-readonly {
  color: #B2B2B2;
}
.required-readonly-label {
  color: red;
}
.fixedheightfive {
  height: 250px;
}
EOF

rm ui_schema.xml.original
