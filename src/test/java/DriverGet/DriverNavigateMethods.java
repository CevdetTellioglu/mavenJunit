package DriverGet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

         driver.get("https://www.amazon.com");

         driver.navigate().to("https://www.facebook.com");

         driver.navigate().back();

         driver.navigate().refresh();

         driver.close();

    }
}
