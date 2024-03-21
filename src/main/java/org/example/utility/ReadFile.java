package org.example.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
    FileReader file;
    Properties prop;


    public String readPropertyFile(String key) {
        try {

            file = new FileReader("C:\\Users\\Admin\\IdeaProjects\\SeleniumProject\\src\\main\\resources\\config.properties");
            prop = new Properties();
            prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value = prop.get(key).toString();
        return value;
    }
}
