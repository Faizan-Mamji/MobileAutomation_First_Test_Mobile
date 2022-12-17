package org.Soum.TestExecution;

import org.Soum.BusinessLayer.BusinessLogic;
import org.Soum.PageObjects.Mobile.Android.SplashScreen;
import org.Soum.PageObjects.Mobile.Android.VehicleCategory;
import org.Soum.PageObjects.Mobile.Android.Vehicles_Series;
import org.Soum.Utils.HelperClasses.AllClasses;
import org.Soum.Utils.HelperClasses.CommonStaticEnumStrings;
import org.Soum.Utils.HelperClasses.PageFactory;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import static org.Soum.Utils.ExtentReports.ExtentTestManager.startTest;

public class MainTestExecution extends PageFactory {
    BusinessLogic objBusiness;
    AllClasses objAll;

    @BeforeSuite
    public void launchBrowser() throws InterruptedException {
        launch_AndroidApplication();
        objAll = new AllClasses(driver);
        objBusiness = new BusinessLogic(driver);
    }

    @Test(priority = 1, description = "Motorcyle_Flow")
    public void TC_001_MotorCycleFlow(Method method) {
        startTest(method.getName(), "Execute motorcycle complete flow");
        objBusiness.TC_MainVehicle_Flow(By.xpath(SplashScreen.btnLocator.getLocator())
                , By.xpath(VehicleCategory.motorCycleOption.getVehicles())
                , By.xpath(Vehicles_Series.series_Option.getSeries()),
                By.id(Vehicles_Series.series_NumericOne.getSeries()), By.id(Vehicles_Series.series_NumericTwo.getSeries()),
                By.id(Vehicles_Series.series_NumericThree.getSeries()), By.id(Vehicles_Series.series_NumericFour.getSeries()),
                CommonStaticEnumStrings.vehicleType_Motorcycle.getCommonStrings(), CommonStaticEnumStrings.mobileScreenshot_Location.getCommonStrings());
    }

    @Test(priority = 2, description = "Car_Flow")
    public void TC_002_CarFlow(Method method) {
        startTest(method.getName(), "Execute Car complete flow");
        objAll.getObjCommonMethods().navigate_Back(2);
        objBusiness.TC_MainVehicle_Flow(By.xpath(SplashScreen.btnLocator.getLocator())
                , By.xpath(VehicleCategory.carOption.getVehicles())
                , By.xpath(Vehicles_Series.series_Option.getSeries()),
                By.id(Vehicles_Series.series_NumericOne.getSeries()), By.id(Vehicles_Series.series_NumericTwo.getSeries()),
                By.id(Vehicles_Series.series_NumericThree.getSeries()), By.id(Vehicles_Series.series_NumericFour.getSeries()),
                CommonStaticEnumStrings.vehicleType_Car.getCommonStrings(), CommonStaticEnumStrings.mobileScreenshot_Location.getCommonStrings());
    }

    @Test(priority = 3, description = "Truck_Flow")
    public void TC_003_TruckFlow(Method method) {
        startTest(method.getName(), "Execute Truck complete flow");
        objAll.getObjCommonMethods().navigate_Back(2);
        objBusiness.TC_MainVehicle_Flow(By.xpath(SplashScreen.btnLocator.getLocator())
                , By.xpath(VehicleCategory.truckOption.getVehicles())
                , By.xpath(Vehicles_Series.series_Option.getSeries()),
                By.id(Vehicles_Series.series_NumericOne.getSeries()), By.id(Vehicles_Series.series_NumericTwo.getSeries()),
                By.id(Vehicles_Series.series_NumericThree.getSeries()), By.id(Vehicles_Series.series_NumericFour.getSeries()),
                CommonStaticEnumStrings.vehicleType_Truck.getCommonStrings(), CommonStaticEnumStrings.mobileScreenshot_Location.getCommonStrings());
    }

    @Test(priority = 4, description = "Truck_Flow")
    public void TC_004_BusFlow(Method method) {
        startTest(method.getName(), "Execute Bus complete flow");
        objAll.getObjCommonMethods().navigate_Back(2);
        objBusiness.TC_MainVehicle_Flow(By.xpath(SplashScreen.btnLocator.getLocator())
                , By.xpath(VehicleCategory.busOption.getVehicles())
                , By.xpath(Vehicles_Series.series_Option.getSeries()),
                By.id(Vehicles_Series.series_NumericOne.getSeries()), By.id(Vehicles_Series.series_NumericTwo.getSeries()),
                By.id(Vehicles_Series.series_NumericThree.getSeries()), By.id(Vehicles_Series.series_NumericFour.getSeries()),
                CommonStaticEnumStrings.vehicleType_Bus.getCommonStrings(), CommonStaticEnumStrings.mobileScreenshot_Location.getCommonStrings());
    }

    @AfterSuite(alwaysRun = true)
    public void teardown() {
        close_MobileApp();
    }
}
