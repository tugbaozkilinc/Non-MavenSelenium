package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Youtube ana sayfasina gidelim. https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");

        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        // Tekrar YouTube'sayfasina donelim
        driver.navigate().back();

        // Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        // Sayfayi Refresh(yenile) yapalim
        Thread.sleep(600);
        driver.navigate().refresh();
        Thread.sleep(500);

        // Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
        driver.quit();

    }
}
