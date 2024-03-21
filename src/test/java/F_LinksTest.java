
import org.example.BaseDriver.DriverFactory;
import org.testng.annotations.Test;
import org.example.DemoQA.pages.HomePage;

public class F_LinksTest extends DriverFactory {

    @Test
    public void brokenLinks()
    {
HomePage homePage = new HomePage(driver);
homePage.clickElements();
    }

    @Test
    public void test2()
    {
        System.out.println("hi test2");
    }

}
