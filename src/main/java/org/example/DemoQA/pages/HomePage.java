package org.example.DemoQA.pages;

import com.github.dockerjava.api.model.Driver;

import org.example.BaseDriver.DriverFactory;
import org.example.utility.JavaScriptMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    JavaScriptMethods method = new JavaScriptMethods();

WebDriver driver;


    @FindBy(xpath="(//div[@class='card-body'])[1]/h5")
    WebElement element;

     public HomePage(WebDriver driver)
    {
        /*super();

       driver=initDriver();*/
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickElements()
    {
        method.scrollTo(driver);
        element.click();

    }



}
