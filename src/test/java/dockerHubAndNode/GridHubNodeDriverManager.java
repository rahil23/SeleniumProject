package dockerHubAndNode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridHubNodeDriverManager {
    WebDriver driver;
    WebDriver getDriver(String browser,String type) throws MalformedURLException {
        if(type.equalsIgnoreCase("local"))
        {
            driver = getLocalDriver();
        }
        else {
            driver=getRemoteDriver(browser);
        }
        return driver;
    }
    public WebDriver getLocalDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    WebDriver getRemoteDriver(String browser) throws MalformedURLException {
        FirefoxOptions ffOptions  = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),getRemoteBrowser(browser));
        return driver;
    }
    Capabilities getRemoteBrowser(String browser)
    {
    Capabilities cap = switch (browser.toLowerCase()) {
        case "firefox" -> new FirefoxOptions();
        case "chrome" -> new ChromeOptions();
        case "ie" -> new EdgeOptions();
        default -> throw new IllegalStateException("unexpected value" + browser.toLowerCase());
    };
    /*    switch (browser.toLowerCase())
        {
            case "firefox":
                cap = new FirefoxOptions();
                break;

            case "chrome":
                cap = new ChromeOptions();
                break;

            case "edge":
                cap = new EdgeOptions();
                break;
            default:
                throw new IllegalStateException("unexpected value"+browser.toLowerCase());*/
        return cap;
    }
}
