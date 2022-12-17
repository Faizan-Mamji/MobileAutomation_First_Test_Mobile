package org.Soum.Utils.HelperClasses;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PageFactory {

    public static final Logger log = LogManager.getLogger(PageFactory.class);
    DesiredCapabilities caps;
    PropertyReader objProp = new PropertyReader(CommonStaticEnumStrings.configPath.getCommonStrings());

    public AppiumDriver driver;
    public String apkDirectory = CommonStaticEnumStrings.apkLocation.getCommonStrings();
    File apkPath = new File(apkDirectory);
    public static ThreadLocal<AppiumDriver> tMdriver = new ThreadLocal<>();

    public AppiumDriver launch_AndroidApplication() {
        caps = new DesiredCapabilities();
        try {
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertyReader.getConfigValue("platformName"));
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);
            caps.setCapability("appPackage", PropertyReader.getConfigValue("appPackage"));
            caps.setCapability("appActivity", PropertyReader.getConfigValue("appActivity"));
            caps.setCapability("noReset", false);
            caps.setCapability(MobileCapabilityType.FULL_RESET, true);
            caps.setCapability(MobileCapabilityType.APP, apkPath.getAbsolutePath());
            System.out.println("The Url generate is " + PropertyReader.getConfigValue("launchUrl") + ":" + PropertyReader.getConfigValue("port") + PropertyReader.getConfigValue("completeUrl"));
            driver = new AndroidDriver(new URL(PropertyReader.getConfigValue("launchUrl") + ":" + PropertyReader.getConfigValue("port") + PropertyReader.getConfigValue("completeUrl")), caps);
            log.info("Android App launch successfully!");
            tMdriver.set(driver);
            driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertyReader.getConfigValue("implicitWait")), TimeUnit.SECONDS);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return driver;
    }

    public static synchronized AppiumDriver getMobileDriver() {
        return tMdriver.get();
    }

    public void close_MobileApp() {
        driver.quit();
    }
}
