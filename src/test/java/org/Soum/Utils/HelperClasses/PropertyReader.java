package org.Soum.Utils.HelperClasses;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

    static FileInputStream fs;
    static Properties prop = new Properties();

    public PropertyReader(String fileName) {
        try {
            fs = new FileInputStream(fileName);
            prop.load(fs);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public static String getConfigValue(String configKey) {
        return prop.getProperty(configKey);
    }
}
