package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Ilk once browser i maximise yapalim, sonra tum sayfa icin maximum bekleme suresi olarak 15 saniye belirtelim.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Sırasiyla amazon, facebook ve youtube sayfalarina gidelim.
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");

        // Amazon sayfasina tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

        // Amazon sayfasinin url nin https://www.amazon.com/ adresine esit oldugunu test edelim.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/"; // https://www.amazon.com/ yazdigin sekle dikkat et yoksa failed alirsin.
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Url test FAILED");
        }

        // Sayfanin konumunu ve boyutlarini yazdiralim.
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        // Sayfanin konumunu ve size ini istedigimiz sekilde ayarlayalim
        driver.manage().window().setPosition(new Point(50, 60));
        driver.manage().window().setSize(new Dimension(600, 800));

        // Istedigimiz sekilde oldugunu test edelim.
        Dimension actualNewSize = driver.manage().window().getSize();
        if(actualNewSize.getWidth()==600 && actualNewSize.getHeight()==800){
            System.out.println("Size test PASSED");
        } else {
            System.out.println("Size test FAILED");
        }
        Point actualNewPosition = driver.manage().window().getPosition();
        if(actualNewPosition.getX()==50 && actualNewPosition.getY()==60){
            System.out.println("Position test PASSED");
        } else {
            System.out.println("Position test FAILED");
        }

        // Sayfayi kapatalim.
        driver.close();

    }
}
