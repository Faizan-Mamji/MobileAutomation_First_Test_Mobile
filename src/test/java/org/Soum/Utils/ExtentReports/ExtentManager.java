package org.Soum.Utils.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.Soum.Utils.HelperClasses.CommonStaticEnumStrings;
import org.Soum.Utils.HelperClasses.PropertyReader;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();
    public static String dateName = new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss").format(new Date());

    PropertyReader objProp = new PropertyReader(CommonStaticEnumStrings.configPath.getCommonStrings());

    public synchronized static ExtentReports createExtentReports() {
//        ExtentSparkReporter reporter = new ExtentSparkReporter("./Soum-Report/ExtentReport-" + dateName + ".html");
        ExtentSparkReporter reporter = new ExtentSparkReporter(CommonStaticEnumStrings.extentReportFolder.getCommonStrings() + dateName + ".html");
        reporter.config().setReportName(PropertyReader.getConfigValue("reportName"));
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Application Name", PropertyReader.getConfigValue("appName"));
        extentReports.setSystemInfo("Implement By", PropertyReader.getConfigValue("implementBy"));
        extentReports.setSystemInfo("App Version", PropertyReader.getConfigValue("appVersion"));
        return extentReports;
    }
}
