package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        //drivers- chromedriver.exe- copy path/reference- path from content root==> src/resources/drivers/chromedriver.exe
        //En temel haliyle otomasyon yapmak icin class imiza otomasyon icin gerekli olan webdriver in yerini gostermemiz gerekir. Bunun icin java kutuphanesinden System.setProperty()
        //methodunun icine ilk olarak driver in type ini yazariz. Ikinci olarak driver in path ini kopyalariz.
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        //TAF: Tek bir kod dili uzerinden web, masaustu ya da mobil uygulamaların geliştirilmesini saglayan bir arayuzdur. Isımızı rahat yapabilmemiz icin hazirlanmis
        //calisma ortamimizdir, çerçeve gibi dusunebilirsin.
        //Note: [1671437003.466][WARNING]: Timed out connecting to Chrome, retrying... yazisini siteye fazla giren olunca alirsin(Baglanti zaman asimina ugradi)
    }

}
