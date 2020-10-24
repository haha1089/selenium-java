package findElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthentication {
    @Test
    void loginWithValidCredentials()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("");
    }
}
