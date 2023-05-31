package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED. Actual title is: " + actualTitle);
        }

        //Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("youtube")){
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Url test FAILED. Actual url is: " + actualUrl);
        }

        //Daha sonra Amazon sayfasina gidin. https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");

        //Youtube sayfasina geri donun
        driver.navigate().back();

        //Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Amazon sayfasina donun
        driver.navigate().forward();

        //Sayfayi tam sayfa yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(5000);

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title)yazdırın.
        String actualAmazonTitle = driver.getTitle();
        if(actualAmazonTitle.contains("Amazon")){
            System.out.println("Amazon title test PASSED");
        } else {
            System.out.println("Amazon title test FAILED. Actual title is: " + actualAmazonTitle);
        }

        //Sayfa URL'sinin https://www.amazon.com/olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualAmazonUrl = driver.getCurrentUrl();
        String expectedAmazonUrl = "https://www.amazon.com";
        if(actualAmazonUrl.equals(expectedAmazonUrl)){
            System.out.println("Amazon url test PASSED");
        } else {
            System.out.println("Amazon url test FAILED. Actual url is: " + actualAmazonUrl);
        }

        //Sayfayi kapatin
        driver.close();
    }

}
