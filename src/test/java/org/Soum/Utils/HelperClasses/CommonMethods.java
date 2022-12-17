package org.Soum.Utils.HelperClasses;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageFactory {
    Actions ac;
    AllClasses objAll;
    String dateName;

    public CommonMethods(AppiumDriver driver) {
        this.driver = driver;
        objAll = new AllClasses(driver);
    }

    public void elementClick_ByActions(By locatorType) {
        ac = new Actions(driver);
        ac.click(objAll.getObjCommonLocators().elemLocator(locatorType)).perform();
    }

    public void navigate_Back(int loopcount) {
        for (int i = 1; i <= loopcount; i++) {
            driver.navigate().back();
        }
    }

    public void sendKeys(By locatorType, String setText) {
        objAll.getObjCommonLocators().elemLocator(locatorType).sendKeys(setText);
    }

    public void click_Element(By locatorType) {
        objAll.getObjCommonLocators().elemLocator(locatorType).click();
    }

    public void screenshotCapturing_MobileApp(String fileName) {
        dateName = new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss").format(new Date());

        try {
            TimeUnit.SECONDS.sleep(1);
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            System.out.println(fileName + "/" + dateName + ".png");
            FileUtils.copyFile(source, new File(fileName + "/" + dateName + ".png"));

        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Screenshot is taken successfully!");
    }
}
