import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void launch() throws IOException {
        FileReader file = new FileReader("C:\\Users\\Admin\\IdeaProjects\\SeleniumProject\\test.properties");
        Properties prop = new Properties();
        prop.load(file);

        String username = (String) prop.get("uname");
        String password = (String) prop.get("pass");

        System.out.println(username);
        System.out.println(password);
    }
}
