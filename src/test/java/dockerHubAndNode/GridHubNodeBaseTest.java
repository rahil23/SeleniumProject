package dockerHubAndNode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GridHubNodeBaseTest {

    WebDriver driver;

    @Parameters({"browser","type"})
    @BeforeTest
    public void setup(String browser,String type) throws MalformedURLException {
        driver = new GridHubNodeDriverManager().getDriver(browser,type);
        driver.get("http://www.google.com");
    }
    @Test
    public void launchGoogle() throws InterruptedException {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("rahul");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertEquals("rahul - Google Search",driver.getTitle());
    }
    @AfterTest
    public void close()
    {
        driver.quit();
    }

}
