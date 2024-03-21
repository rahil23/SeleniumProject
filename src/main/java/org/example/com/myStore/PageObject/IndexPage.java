package org.example.com.myStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class IndexPage {

    WebDriver driver;
    @FindBy(id="nav-link-accountList-nav-line-1")
    WebElement signin_Btn;

    @FindBy(id="twotabsearchtextbox")
    WebElement textBox_seacrhBox;

    @FindBy(xpath="//div[@class='s-suggestion s-suggestion-ellipsis-direction']")
    List<WebElement> searchBox_autoSuggestion;

    @FindBy(xpath="//div[@id='brandsRefinements']/ul/span/span[index]/li/span/a/span")
    List<WebElement> brandCheckBox;

    @FindBy(xpath="//div[@id='brandsRefinements']/ul/span/span")
    List<WebElement> brandCheckBoxBulk;


    public IndexPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickSignin()
    {
        signin_Btn.click();
    }

    public void searchSpecificKeyword(String key,String value)
    {
        textBox_seacrhBox.sendKeys(key);
        for(int i=0;i<searchBox_autoSuggestion.size();i++)
        {
            if(searchBox_autoSuggestion.get(i).getText().equals(value))
            {
                searchBox_autoSuggestion.get(i).click();
            }
        }
        Assert.fail();
    }

/*    public void clickCheckBox(String checkBoxName)
    {

        for(int i=0;i<brandCheckBoxBulk.size();i++)
        {

        }
    }*/
}
