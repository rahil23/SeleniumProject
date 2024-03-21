import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SeleniumExersize {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK ')]")).click();

        driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();;

                driver.findElement(By.xpath("(//div[@id='Textbox']/button)[1]")).click();
                driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("(//div[@id='Textbox']/button)[1]")).click();
        driver.switchTo().alert().sendKeys("hi");
        driver.switchTo().alert().accept();
WebElement ele = driver.findElement(By.xpath("(//div[@id='Textbox']/button)[1]"));
        Actions ac = new Actions(driver);
        ac.moveToElement(ele).contextClick().perform();

/*        Robot rw = new Robot();
        rw.keyPress(KeyEvent.VK_N);
        rw.keyPress(KeyEvent.VK_E);*/


    }
}
