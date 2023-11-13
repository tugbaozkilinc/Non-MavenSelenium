package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Homework01 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidin https://www.amazon.com
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin.
        System.out.println("The position of the page is: " + driver.manage().window().getPosition());
        System.out.println("The size of the page is: " + driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(75, 0));
        driver.manage().window().setSize(new Dimension(750, 750));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        String actualPosition = String.valueOf(driver.manage().window().getPosition());
        String actualSize = String.valueOf(driver.manage().window().getSize());
        String expectedPosition = "(75, 0)";
        String expectedSize = "(750, 750)";
        if(actualPosition.equals(expectedPosition) && actualSize.equals(expectedSize)){
            System.out.println("Position and size test PASSED");
        } else {
            System.out.println("Position and size test FAILED");
        }

        //Sayfayi kapatin
        driver.close();
    }

}
