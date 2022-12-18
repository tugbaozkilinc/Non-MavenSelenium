package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork02 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Bunu sayfayı açtıktan sonra yapmayı alışkanlık haline getir, cunku butonlar arasında kaymalar olabilir.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Bunu da aliskanlik haline getir. Her bir web elementin sayfaya gelme suresi var o yuzden beklemeliyiz, bazı elementler web sayfasına
                                                                           // gec yuklenebiliyor, bu sureyi siteye yuklenme durumlarında arttırman gerekir.
                                                                           // Istenen sayfa acilincaya kadar her bir web element icin bekleme suresini belirtir.
        // ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("facebook")){
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED. Actual title is: " + actualTitle);
        }

        // Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("facebook")){
            System.out.println("Url test PASSED");
        } else
            System.out.println("Url test FAILED. Actual url is: " + actualTitle);

        // https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        // Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title test PASSED");
        } else
            System.out.println("Title test FAILED");

        // Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        // Sayfayi yenileyin
        driver.navigate().refresh();

        // Browser’i kapatin
        driver.close();

    }
}
