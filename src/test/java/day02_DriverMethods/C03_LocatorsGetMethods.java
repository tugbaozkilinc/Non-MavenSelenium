package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        //Search bolumunu locate edip, iphone aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        searchBox.submit();

        //Arama sonuc yazisini konsola yazdiralim.
        WebElement element = driver.findElement(By.className("sg-col-inner"));
        System.out.println(element.getText()); //1-16 of 241 results for "iphone"

        //Sayfayi kapatalim
        driver.close();

        //webElement.submit() ile Keys.ENTER in farki; bazen siteler search butonuna yazdiktan sonra enter a basmayi kabul etmez, search butonuna basman gerekir. Keys.ENTER in islemedigini
        //gordugunde search butonunu locate eder submit() i kullanirsin.
    }

}
