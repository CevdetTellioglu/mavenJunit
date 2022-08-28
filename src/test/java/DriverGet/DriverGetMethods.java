package DriverGet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //1 driver.get("url") to url
        driver.get("https://www.amazon.com");
       // driver.getTitle() get Title page
        System.out.println("Page Title :"+ driver.getTitle());

        // driver.getCurrentUrl() icinde oldugu sayfanin url sini dondurur
        System.out.println(driver.getCurrentUrl());

        //driver.getPageSource(); sayfanin kaynak kodlarini dondurur
        System.out.println("--------------" );
        System.out.println(driver.getPageSource()); // arka planda calisan sayfa kodlarini aliriz
        System.out.println("---------------");

        // driver.getWindowHandle() -- icinde oldugu sayfanin UNIQUE hash kodunu dondurur
        System.out.println(driver.getWindowHandle());

        // driver.getWindowHandles()  driver calisirken acilan tum sayfalarin UNIQUE hash kodunu dondurur
    }
}
