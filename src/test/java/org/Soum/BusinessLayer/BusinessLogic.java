package org.Soum.BusinessLayer;

import io.appium.java_client.AppiumDriver;
import org.Soum.Utils.HelperClasses.AllClasses;
import org.Soum.Utils.HelperClasses.CommonStaticEnumStrings;
import org.Soum.Utils.HelperClasses.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class BusinessLogic extends PageFactory {
    AllClasses objAll;
    public static final Logger log = LogManager.getLogger(BusinessLogic.class);

    public BusinessLogic(AppiumDriver driver) {
        this.driver = driver;
        objAll = new AllClasses(driver);
    }

    public void TC_MainVehicle_Flow(By locator_LanguageSelection, By locator_VehicleType,
                                    By locator_VehicleSeries, By Numeric_One, By Numeric_Two,
                                    By Numeric_Three, By Numeric_Four, String vehicleCategory, String testCaseFilename) {
        log.info("Navigate to splash screen");
        if (CommonStaticEnumStrings.vehicleType_Motorcycle.getCommonStrings().equalsIgnoreCase(vehicleCategory)) {
            objAll.getObjCommonMethods().click_Element(locator_LanguageSelection);
            log.info("Click on Arabe button");
        }
        objAll.getObjCommonMethods().screenshotCapturing_MobileApp(testCaseFilename);
        objAll.getObjCommonMethods().click_Element(locator_VehicleType);
        log.info("Click on vehicle - " + vehicleCategory + " button!");
        objAll.getObjCommonMethods().click_Element(locator_VehicleSeries);
        log.info("Click on series button in " + vehicleCategory + " category page!");
        objAll.getObjCommonMethods().click_Element(Numeric_One);
        log.info("Click on Numeric 1 button successfully");
        objAll.getObjCommonMethods().click_Element(Numeric_Two);
        log.info("Click on Numeric 2 button successfully");
        objAll.getObjCommonMethods().click_Element(Numeric_Three);
        log.info("Click on Numeric 3 button successfully");
        objAll.getObjCommonMethods().click_Element(Numeric_Four);
        log.info("Click on Numeric 4 button successfully");
        objAll.getObjCommonMethods().screenshotCapturing_MobileApp(testCaseFilename);
    }
}
