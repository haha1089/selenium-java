package browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com.vn");
        driver.navigate().to( "https://google.com.vn");
        driver.manage().window().fullscreen();

        driver.close();

    }
}
