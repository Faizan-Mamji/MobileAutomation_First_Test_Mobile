package org.Soum.Utils.HelperClasses;

public enum CommonStaticEnumStrings {

    vehicleType_Motorcycle("Motorcyle"),
    vehicleType_Car("Car"),
    vehicleType_Truck("Truck"),
    vehicleType_Bus("Bus"),
    mobileScreenshot_Location("Mobile_Screenshots"),
    configPath("src/test/Resources/Config.properties"),

    extentCOnfigPath("src/test/Resources/extent.properties"),

    extentReportFolder("./Soum-Report/ExtentReport-"),
    apkLocation("Android_Apk/FTM_1.0_Apkpure.apk");

    public String description;

    CommonStaticEnumStrings(String desc) {
        this.description = desc;
    }

    public String getCommonStrings() {
        return description;
    }


}
