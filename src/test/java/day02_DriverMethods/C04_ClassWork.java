package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> searchResult = driver.findElements(By.className("sg-col-inner"));
        System.out.println(searchResult.get(0).getText()); //1-16 of 126 results for "city bike"

        //Arama sonuc sayisini consol a yazdiriniz.
        String[] resultNumber = searchResult.get(0).getText().split(" ");
        System.out.println("Result number is: " + resultNumber[2]); //126

        //Sonuc sayisini lambda ile yazdiriniz.
        Arrays.stream(searchResult.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println); //126
        Arrays.stream(resultNumber).limit(3).skip(2).forEach(System.out::println); //126

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> firstWebElement = driver.findElements(By.className("s-image"));
        firstWebElement.get(0).click();
    }

}
