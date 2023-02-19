package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //"Salesforce Apex Questions Bank" icin arama yapiniz
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);

        //Kac sonuc bulundugunu yaziniz
        System.out.println(driver.findElement(By.xpath("//*[text()='4 results for']")).getText());

        //Sayfayi kapatin
        driver.close();
    }

}
