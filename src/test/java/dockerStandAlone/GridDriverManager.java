package dockerStandAlone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDriverManager {
    WebDriver driver;
    WebDriver getDriver(String type) throws MalformedURLException {
        if(type.equalsIgnoreCase("local"))
        {
            driver = getLocalDriver();
        }
        else {
            driver=getRemoteDriver();
        }
        return driver;
    }
    public WebDriver getLocalDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    WebDriver getRemoteDriver() throws MalformedURLException {
        FirefoxOptions ffOptions  = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),ffOptions);
        return driver;
    }
}
