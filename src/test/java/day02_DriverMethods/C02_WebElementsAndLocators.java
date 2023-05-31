package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsAndLocators {

    public static void main(String[] args) {

        //Note: Web elementlerin hepsi tag ve attribute degerlere sahip. Biz de bu web elementlere ulasmak icin tag ve attribute degerleri adres gosterecegiz(Bunlarla ulasilamayan
        //web elementler icin ozel olarak tanimlanan xpath ve css locator lar kullanilir.), nasıl manuel
        //olarak bu web elementlerde islem yapıyorsak bu sekilde o islemleri otomasyonlastıracagız. Otomasyon icin unique web elementlerini tanimlamak uzere HTML kodunu inceleyecegiz. (inspect).
        //Selenium locators, web sayfasindaki web ogelerini tanimlamak icin kullanilir.
        //Bir web elementini tanimlamak icin 8 tane Selenium locator vardir; id(en hizli ve guvenli locator secenegi), name, className, tagName, linkText, partialLinkText,
        //xpath(xpath yazmanin birden fazla yolu vardir.), cssSelector(cssSelector yazmanin birden fazla yolu vardir.)

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim.
        driver.get("https://amazon.com");

        //Search bolumunu locate edelim. (Web elementini kullanabilmek icin once locate yapiyoruz.)
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox")); //Locate ettigimiz web elementini kullanabilmek icin bir variable a atama yapariz.
                                                                                 //Tanimladigimiz web elementin yerini driver in bulabilmesi icin findElement(locator) methodunu kullaniriz.
        //Search bolumunde iphone aratalim.
        searchBox.sendKeys("iphone", Keys.ENTER);

        //Eger bir web elementi (web sayfasindaki her bir buton ya da text) locate (konumunu belirleme) etmek istersek once manuel olarak web sayfasini acip sayfa uzerinde
        //sag click yapip incele(inspect) ye tiklariz. Karsimiza cikan html kodlarindan locator lardan(konum belirleyiciler) essiz olani seceriz. Genellikle id attribute u kullanilir.
        //Sectigimiz attribute degerini findElement(locator) method unun icine parameter olarak yazacagimiz locator in 8 locator dan hangisi oldugunu belirtmek icin
        //By.locatorTuru("attribute degeri(locate bilgisi)") seklinde yazariz.

        //Amazon sayfasındaki <input> ve <a> tag larinin sayisini yazdiriniz.
        List<WebElement> inputTags = driver.findElements(By.tagName("input")); //findElements() locator degerine uygun web elementlerin listesini dondurur.
        System.out.println("Input tag number is: " + inputTags.size());

        List<WebElement> aTags = driver.findElements(By.tagName("a"));
        System.out.println("A tag number is: " + aTags.size());

        //Linkleri yazdiralim.
        for(WebElement w : aTags){
            System.out.println(w.getText()); //Linkleri yazdirdik.
        }
        driver.close();

        //Note: attribute un unique olup olmadıgını anlamak icin, inspect dedikten sonra ctrl+f e bas search butonuna gec. Mesela search butonuna id yazarsan sana 1 match geldigini gorursun.
    }

}
