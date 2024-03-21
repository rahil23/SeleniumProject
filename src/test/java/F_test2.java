import org.example.BaseDriver.DriverFactory;
import org.example.DemoQA.pages.HomePage;
import org.testng.annotations.Test;

public class F_test2 extends DriverFactory {

    @Test
    public void brokenLinks_test2()
    {
HomePage homePage = new HomePage(driver);
homePage.clickElements();
    }

    @Test
    public void test2_test2()
    {
        System.out.println("hi test2");
    }
    
}
