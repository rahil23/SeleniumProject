package org.example;

import org.apache.commons.io.FileUtils;
import org.example.com.myStore.utilities.ReadConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    ReadConfig readConfig = new ReadConfig();
    String browserName = readConfig.loadProperties("browser");
    String url = readConfig.loadProperties("baseUrl");
    String driverPath;

    @BeforeClass
    public void setup()
    {
        switch(browserName.toLowerCase())
        {
            case "chrome":
                driverPath = System.getProperty("user.dir")+"\\Drivers\\ChromeSetup.exe";
                System.setProperty("webdriver.chrome.driver", driverPath);
                driver = new ChromeDriver();
                break;

            case "firefox":
                driverPath = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", driverPath);
                driver = new FirefoxDriver();
                break;

            case "ieDriver":
                driverPath = System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";
                System.setProperty("webdriver.chrome.driver", driverPath);
                driver = new ChromeDriver();
                break;

            default:
                driver=null;
                break;
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    //user method to capture screen shot
    public void captureScreenShot(WebDriver driver,String testName) throws IOException
    {
        //step1: convert webdriver object to TakesScreenshot interface
        TakesScreenshot screenshot = ((TakesScreenshot)driver);

        //step2: call getScreenshotAs method to create image file

        File src = screenshot.getScreenshotAs(OutputType.FILE);

        File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");

        //step3: copy image file to destination
        FileUtils.copyFile(src, dest);
    }



}
