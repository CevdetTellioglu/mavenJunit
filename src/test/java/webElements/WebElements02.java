package webElements;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;

public class WebElements02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");
        // cookies cikarsa kabul et butonuna basin
        driver.findElement(By.xpath("//button[@title='Autoriser les cookies essentiels et optionnels']")).click();
        // e-posta kutusuna rastgele bir mail girin
        WebElement epostbox = driver.findElement(By.xpath("//*[@id='email']"));
        epostbox.sendKeys("zemflkmlzk");
        // sifre kismina rastgele bir sifre girin
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='pass']"));
        passwordBox.sendKeys("aazeds");
        // giris yap butonuna basin
        driver.findElement(By.xpath("//button[@name='login']")).click();
        // uyari olarak "L’adresse e-mail ou le numéro de mobile que vous avez saisi(e) n’est pas associé(e) à un compte. Trouvez votre compte et connectez-vous."
        //  mesajinin ciktigini test edin
       WebElement resultLettre = driver.findElement(By.xpath("//div[@class='_9ay7']"));
       String expectedResultLettre = "L’adresse e-mail ou le numéro de mobile que vous avez saisi(e) n’est pas associé(e) à un compte. Trouvez votre compte et connectez-vous.";
       String actualResultLettre = resultLettre.getText();
       if(expectedResultLettre.equals(actualResultLettre)){
           System.out.println("Passed");
       }else {
           System.out.println("Failed");
       }
       driver.close();


    }
}
