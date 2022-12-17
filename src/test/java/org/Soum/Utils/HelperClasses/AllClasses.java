package org.Soum.Utils.HelperClasses;

import io.appium.java_client.AppiumDriver;

public class AllClasses extends PageFactory {

    CommonMethods objCommonMethods;
    CommonLocators objCommonLocators;

    public AllClasses(AppiumDriver driver) {
        this.driver = driver;
    }

    public CommonMethods getObjCommonMethods() {
        return objCommonMethods = new CommonMethods(driver);
    }

    public CommonLocators getObjCommonLocators() {
        return objCommonLocators = new CommonLocators(driver);
    }
}
