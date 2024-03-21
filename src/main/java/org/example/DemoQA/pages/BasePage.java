package org.example.DemoQA.pages;

import org.example.BaseDriver.DriverFactory;
import org.example.utility.ReadFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends DriverFactory {
    /***
     * This method is responsible to get Existing or new drive instance from base Test Class
     * @return
     *
     */
    //ReadFile readFile;
    ReadFile readFile = new ReadFile();
    public WebDriver initDriver()
    {
        return getWebDriver();

    }

    /***
     * This is existing class constructor to initialize the driver and page factory for all child classes
     */
    public BasePage() {
        initDriver();
        PageFactory.initElements(driver, this);
    }

}
