package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Feature
     */
    public static View get_Feature(Solo solo) {
        String ref = "Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Measurement
     */
    public static View get_Measurement(Solo solo) {
        String ref = "Measurement";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Photolog
     */
    public static View get_Photolog(Solo solo) {
        String ref = "Photolog";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Control
     */
    public static View get_Control_Control(Solo solo) {
        String ref = "Control/Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Map
     */
    public static View get_Control_Map(Solo solo) {
        String ref = "Control/Map";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Tracklog
     */
    public static View get_Control_Tracklog(Solo solo) {
        String ref = "Control/Tracklog";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Feature/Detail
     */
    public static View get_Feature_Detail(Solo solo) {
        String ref = "Feature/Detail";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Feature/External_Photos
     */
    public static View get_Feature_ExternalPhotos(Solo solo) {
        String ref = "Feature/External_Photos";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Feature/Feature
     */
    public static View get_Feature_Feature(Solo solo) {
        String ref = "Feature/Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Feature/Measurement
     */
    public static View get_Feature_Measurement(Solo solo) {
        String ref = "Feature/Measurement";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/User_List
     */
    public static View get_Login_UserList(Solo solo) {
        String ref = "Login/User_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Measurement/Measurement
     */
    public static View get_Measurement_Measurement(Solo solo) {
        String ref = "Measurement/Measurement";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Photolog/Photolog
     */
    public static View get_Photolog_Photolog(Solo solo) {
        String ref = "Photolog/Photolog";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Control/New_Feature
     */
    public static View get_Control_Control_NewFeature(Solo solo) {
        String ref = "Control/Control/New_Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Control/New_Photolog
     */
    public static View get_Control_Control_NewPhotolog(Solo solo) {
        String ref = "Control/Control/New_Photolog";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Map/Center_Me_1
     */
    public static View get_Control_Map_CenterMe1(Solo solo) {
        String ref = "Control/Map/Center_Me_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Map/Save_Map_Settings_1
     */
    public static View get_Control_Map_SaveMapSettings1(Solo solo) {
        String ref = "Control/Map/Save_Map_Settings_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Tracklog/SyncOff
     */
    public static View get_Control_Tracklog_SyncOff(Solo solo) {
        String ref = "Control/Tracklog/SyncOff";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Tracklog/SyncOn
     */
    public static View get_Control_Tracklog_SyncOn(Solo solo) {
        String ref = "Control/Tracklog/SyncOn";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Tracklog/startGPSButton
     */
    public static View get_Control_Tracklog_startGPSButton(Solo solo) {
        String ref = "Control/Tracklog/startGPSButton";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Tracklog/stopGPSButton
     */
    public static View get_Control_Tracklog_stopGPSButton(Solo solo) {
        String ref = "Control/Tracklog/stopGPSButton";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Tracklog/trackOffButton
     */
    public static View get_Control_Tracklog_trackOffButton(Solo solo) {
        String ref = "Control/Tracklog/trackOffButton";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Tracklog/trackdistButton
     */
    public static View get_Control_Tracklog_trackdistButton(Solo solo) {
        String ref = "Control/Tracklog/trackdistButton";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Tracklog/tracktimeButton
     */
    public static View get_Control_Tracklog_tracktimeButton(Solo solo) {
        String ref = "Control/Tracklog/tracktimeButton";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Detail/Detail_Photos_Button_1
     */
    public static View get_Feature_Detail_DetailPhotosButton1(Solo solo) {
        String ref = "Feature/Detail/Detail_Photos_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Feature/CHECK_FOR_MISSING_DATA
     */
    public static View get_Feature_Feature_CHECKFORMISSINGDATA(Solo solo) {
        String ref = "Feature/Feature/CHECK_FOR_MISSING_DATA";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Feature/Overview_Photos_Button_1
     */
    public static View get_Feature_Feature_OverviewPhotosButton1(Solo solo) {
        String ref = "Feature/Feature/Overview_Photos_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Feature/Photo_of_Sketch_Button_1
     */
    public static View get_Feature_Feature_PhotoofSketchButton1(Solo solo) {
        String ref = "Feature/Feature/Photo_of_Sketch_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Feature/Take_From_GPS_1
     */
    public static View get_Feature_Feature_TakeFromGPS1(Solo solo) {
        String ref = "Feature/Feature/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Measurement/Add_Measurement
     */
    public static View get_Feature_Measurement_AddMeasurement(Solo solo) {
        String ref = "Feature/Measurement/Add_Measurement";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Feature/Detail/Detail_Photos
     */
    public static View get_Feature_Detail_DetailPhotos(Solo solo) {
        String ref = "Feature/Detail/Detail_Photos";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Feature/Feature/Overview_Photos
     */
    public static View get_Feature_Feature_OverviewPhotos(Solo solo) {
        String ref = "Feature/Feature/Overview_Photos";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Feature/Feature/Photo_of_Sketch
     */
    public static View get_Feature_Feature_PhotoofSketch(Solo solo) {
        String ref = "Feature/Feature/Photo_of_Sketch";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Feature/Detail/Material
     */
    public static View get_Feature_Detail_Material(Solo solo) {
        String ref = "Feature/Detail/Material";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Search/Entity_Types
     */
    public static View get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Feature/Feature/Feature_Type
     */
    public static View get_Feature_Feature_FeatureType(Solo solo) {
        String ref = "Feature/Feature/Feature_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Measurement/Measurement/Dimension
     */
    public static View get_Measurement_Measurement_Dimension(Solo solo) {
        String ref = "Measurement/Measurement/Dimension";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Tracklog/Next_Feature_ID
     */
    public static EditText get_Control_Tracklog_NextFeatureID(Solo solo) {
        String ref = "Control/Tracklog/Next_Feature_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Tracklog/refreshText
     */
    public static EditText get_Control_Tracklog_refreshText(Solo solo) {
        String ref = "Control/Tracklog/refreshText";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Tracklog/trackStatus
     */
    public static View get_Control_Tracklog_trackStatus(Solo solo) {
        String ref = "Control/Tracklog/trackStatus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Tracklog/trackdistText
     */
    public static EditText get_Control_Tracklog_trackdistText(Solo solo) {
        String ref = "Control/Tracklog/trackdistText";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Tracklog/tracktimeText
     */
    public static EditText get_Control_Tracklog_tracktimeText(Solo solo) {
        String ref = "Control/Tracklog/tracktimeText";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Detail/Asociated_Material_Notes
     */
    public static EditText get_Feature_Detail_AsociatedMaterialNotes(Solo solo) {
        String ref = "Feature/Detail/Asociated_Material_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/External_Photos/External_Photo_Notes
     */
    public static EditText get_Feature_ExternalPhotos_ExternalPhotoNotes(Solo solo) {
        String ref = "Feature/External_Photos/External_Photo_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/External_Photos/IDs_of_Pictures_from_External_Camera
     */
    public static EditText get_Feature_ExternalPhotos_IDsofPicturesfromExternalCamera(Solo solo) {
        String ref = "Feature/External_Photos/IDs_of_Pictures_from_External_Camera";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Accuracy
     */
    public static View get_Feature_Feature_Accuracy(Solo solo) {
        String ref = "Feature/Feature/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Comments
     */
    public static EditText get_Feature_Feature_Comments(Solo solo) {
        String ref = "Feature/Feature/Comments";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Description
     */
    public static EditText get_Feature_Feature_Description(Solo solo) {
        String ref = "Feature/Feature/Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Easting
     */
    public static View get_Feature_Feature_Easting(Solo solo) {
        String ref = "Feature/Feature/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Feature_ID
     */
    public static EditText get_Feature_Feature_FeatureID(Solo solo) {
        String ref = "Feature/Feature/Feature_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Interpretation
     */
    public static EditText get_Feature_Feature_Interpretation(Solo solo) {
        String ref = "Feature/Feature/Interpretation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Latitude
     */
    public static View get_Feature_Feature_Latitude(Solo solo) {
        String ref = "Feature/Feature/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Longitude
     */
    public static View get_Feature_Feature_Longitude(Solo solo) {
        String ref = "Feature/Feature/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Feature/Northing
     */
    public static View get_Feature_Feature_Northing(Solo solo) {
        String ref = "Feature/Feature/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Measurement/Measurement/Measurement
     */
    public static EditText get_Measurement_Measurement_Measurement(Solo solo) {
        String ref = "Measurement/Measurement/Measurement";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photolog/Photolog/External_Photo_Notes
     */
    public static EditText get_Photolog_Photolog_ExternalPhotoNotes(Solo solo) {
        String ref = "Photolog/Photolog/External_Photo_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photolog/Photolog/IDs_of_Picture_from_External_Camera
     */
    public static EditText get_Photolog_Photolog_IDsofPicturefromExternalCamera(Solo solo) {
        String ref = "Photolog/Photolog/IDs_of_Picture_from_External_Camera";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photolog/Photolog/Photographed_Feature_ID
     */
    public static EditText get_Photolog_Photolog_PhotographedFeatureID(Solo solo) {
        String ref = "Photolog/Photolog/Photographed_Feature_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Control/List_of_Existing_Features
     */
    public static View get_Control_Control_ListofExistingFeatures(Solo solo) {
        String ref = "Control/Control/List_of_Existing_Features";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Feature/Measurement/List_of_Measurements
     */
    public static View get_Feature_Measurement_ListofMeasurements(Solo solo) {
        String ref = "Feature/Measurement/List_of_Measurements";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Login/User_List/Users
     */
    public static View get_Login_UserList_Users(Solo solo) {
        String ref = "Login/User_List/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: map
        Ref:  Control/Map/Map
     */
    public static View get_Control_Map_Map(Solo solo) {
        String ref = "Control/Map/Map";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Control/Tracklog/internalExternalGPS
     */
    public static View get_Control_Tracklog_internalExternalGPS(Solo solo) {
        String ref = "Control/Tracklog/internalExternalGPS";
        return (android.view.View) solo.getView((Object) ref);
    }
}
