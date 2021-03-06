package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {
    @Test
    void withValidCredentials()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button//*[contains(.,'Login')]")).click();
        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://the-internet.herokuapp.com/secure",
                "Login Failed hehe");

        driver.quit();

    }
}
