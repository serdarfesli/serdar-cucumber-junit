package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Something happened in the configurationReader Class");
            e.printStackTrace();
        }
    }
    public static String getProperty(String key)   {
        return properties.getProperty(key);
    }

}
