package org.Soum.Utils.HelperClasses;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CommonLocators extends PageFactory {

    public CommonLocators(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement elemLocator(By locatorType) {
        return driver.findElement(locatorType);
    }

    public List<WebElement> list_ElemLocators(By locatorType) {
        return driver.findElements(locatorType);
    }
}
