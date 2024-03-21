import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample {

    @Test
    public void openBrowser() {
      String  driverPath = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverPath);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/test/newtours/");

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();

        driver.switchTo().frame(1);
        driver.findElement(By.id("dismiss-button")).click();
        action.sendKeys(Keys.ESCAPE);
        driver.switchTo().parentFrame();
        driver.quit();


        //driver.findElement(By.cssSelector("span.icp-nav-link-inner")).click();

    }
}
