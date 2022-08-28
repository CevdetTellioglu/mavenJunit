package DriverGet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // driver.manage().window().getSize() --- icinde oldugu sayfanin pixel olarak olculerini dondurur

        System.out.println(driver.manage().window().getSize());

        // driver.manage().window().getPosition() ---- icinde bulundugu sayfanin pixel olarak konumunu verir .
        // selenium sol alttan olcmeye baslar
        System.out.println(driver.manage().window().getPosition());

        //driver.manage().window().setPosition(new poin(15,15)); ---- icinde oldugu sayfanin sol alt kosesini bizim yazacagimiz pixel noktasina tasir
        driver.manage().window().setPosition(new Point(15,15));

        //   driver.manage().window().setSize(new Dimension(900,600)); --- icinde oldugu sayfanin sol alt kosesi sabit olarak bizim yazacagimiz olculere getirir
        driver.manage().window().setSize(new Dimension(900,600));

        //Konumu ve boyutu yenilendikten sonra tekrar yazdirirsak
        System.out.println("yeni pencere olculeri : "+driver.manage().window().getSize()); // (900,600)
        System.out.println("yeni pencere konumu : "+ driver.manage().window().getPosition()); // (15,15)

        //  driver.manage().window().maximize(); maximize eder
        //  driver.manage().window().fullscreen(); fullscreen eder

        //bu ikisinin farklarinin gorelim

        driver.manage().window().maximize();
        System.out.println("Maximize  olculeri : "+driver.manage().window().getSize()); // (900,600)
        System.out.println("Maximize  konumu : "+ driver.manage().window().getPosition()); // (15,15)

        driver.manage().window().fullscreen();
        System.out.println("Fullscreen olculeri : "+driver.manage().window().getSize()); // (900,600)
        System.out.println("Fullscreen konumu : "+ driver.manage().window().getPosition()); // (15,15)

    //    driver.manage().window().minimize(); --- minimize eder
        driver.manage().window().minimize();

         // driver.manage().timeouts(); methodlari

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 /*      wait konusunu ilerde tek basina ele alacagiz
                ancak her class icin yapmamiz gereken bir ayar oldugu icin burada kisaca deginelim
                implicitlyWait : driver'a sayfanin yuklenmesi ve kullanacagimiz webelementlerin bulunmasi icin
                                 bekleyecegi maximum sureyi belirtir.
                                 driver bu sure icerisinde sayfa yuklenir/web element bulunursa
                                 beklemeden calismaya devam eder.
                                 bu sure bittigi halde sayfa yuklenememis/webElement bulunamamissa
                                 exception vererek calismayi durdurur
                Duration.ofSeconds(15) : Duration class'i Selenium-4 ile gelen zaman class'idir
                                         Yani driver'a ne kadar bekleyecegini soyler
                                         Duration.ofSeconds(15) yerine milis,minutes,hours da kullanilabilir
         */

        /* NOT :    Driver'in istedigimiz islemleri yaparken sorunla karsilasmamasi icin
                    driver.manage() method'larindan
                    maximize() ve implicitlyWait() method'larinin her test'te kullanilmasi
                    FAYDALI OLACAKTIR
         */

    }

}
