package org.example.com.myStore.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    public ReadConfig(){}

    public String loadProperties(String propName){
        Properties properties = new Properties();
        try {
            String path = System.getProperty("user.dir");

            //C:\Users\Admin\IdeaProjects\SeleniumProject\src\main\resources\config.properties
            FileInputStream fis = new FileInputStream("\\src\\main\\resources\\config.properties");
            properties.load(fis);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        String propValue = properties.getProperty(propName);
        if(propValue!=null) {
            return propValue;
        }
        else {
            throw new RuntimeException("property not found with specific key in configration.properties file");
        }
    }
}
