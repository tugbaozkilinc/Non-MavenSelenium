package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //techproeducation sayfasina gidelim
        Thread.sleep(3000); //3 sn bekler
        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back(); //amazon sayfasina geri doner

        //Tekrar techproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); //Techpro ya gider

        //Son sayfada sayfayi yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //ve sayfayi kapatalim
        driver.close();
    }

}
