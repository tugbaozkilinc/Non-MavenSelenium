package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        // drivers- chromedriver.exe- copy path/reference- path from content root==> src/resources/drivers/chromedriver.exe
        // En temel haliyle otomasyon yapmak icin class imiza otomasyon icin gerekli olan webdriver in yerini gostermemiz gerekir. Bunun icin java kutuphanesinden System.setProperty()
        // methodunun icine ilk olarak driver i yazariz. Ikinci olarak driver in fiziki yolunu kopyalariz.
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}
