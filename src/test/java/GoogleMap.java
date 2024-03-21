import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class GoogleMap {
        WebDriver driver;

        @BeforeMethod
        public void launchBrowser()
        {
       /*     String  driverPath = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", driverPath);
             driver = new FirefoxDriver();*/

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.get("https://www.google.com/maps/@29.9380663,76.005885,11z?entry=ttu");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }
        @Test
        public void test1()
        {
            driver.findElement(By.id("searchboxinput")).clear();
            driver.findElement(By.id("searchboxinput")).sendKeys("Asha Tiffins HSR");
            driver.findElement(By.id("searchbox-searchbutton")).click();
            driver.findElement(By.xpath("//button[@data-value='Directions']")).click();
//driver.findElement(By.xpath("(//a[@aria-label='Asha Tiffins'][1])[1]")).click();
            driver.findElement(By.xpath("(//input[@class=\"tactile-searchbox-input\"])[1]"))
                    .sendKeys("rameshwaram cafe brookefield");
            driver.findElement(By.xpath("(//input[@class=\"tactile-searchbox-input\"])[1]")).sendKeys(Keys.ENTER);
List<WebElement> list2 = driver.findElements(By.xpath("//div[starts-with(@id,'section-directions-trip')]"));
            Assert.assertTrue(list2.size()>0);

        }

        @AfterMethod
    public void closeSession()
        {
            driver.quit();
        }
    }
