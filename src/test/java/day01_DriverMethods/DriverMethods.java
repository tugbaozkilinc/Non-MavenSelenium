package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Bos bir browser actik
        driver.get("https://www.amazon.com"); // ilk olarak gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayfa Basligi: " + driver.getTitle()); // Sayfa Basligi: Amazon.com. Spend less. Smile more.
        System.out.println("Sayfa url'i: " + driver.getCurrentUrl()); // Sayfa url'i: https://www.amazon.com/
        // System.out.println(driver.getPageSource()); Sayfanın kaynak kodları
        System.out.println(driver.getWindowHandle()); // Bize o window a ait hash degerini verir. Biz bu hash degerlerini bir String e atayip pencereler arasi gecis yapabiliriz.

    }
}
