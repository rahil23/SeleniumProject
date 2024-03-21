package org.example.com.myStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="ap_email")
    WebElement typeEmail;

    @FindBy(xpath="//input[@id='continue']")
    WebElement clickContinue;

    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement typePassword;

    @FindBy(id="signInSubmit")
    WebElement clickSignin;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterEmail(String emailId)
    {
        typeEmail.clear();
        typeEmail.sendKeys(emailId);
    }
    public void setClickContinue()
    {
        clickContinue.click();
    }
    public void typePassword(String password)
    {
        typePassword.clear();
        typePassword.sendKeys(password);
    }
    public void clickSign()
    {
        clickSignin.click();
    }
}
