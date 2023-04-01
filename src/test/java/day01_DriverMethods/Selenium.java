package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.close();
        //TAF(Test Automation Framework): Tek bir kod dili uzerinden web, masaustu ya da mobil uygulamaların geliştirilmesini saglayan bir arayuzdur. Isımızı rahat yapabilmemiz icin hazirlanmis
        //calisma ortamimizdir, çerçeve gibi dusunebilirsin.
        //Note: [1671437003.466][WARNING]: Timed out connecting to Chrome, retrying... yazisini siteye fazla giren olunca alirsin(Baglanti zaman asimina ugradi)
    }

}
