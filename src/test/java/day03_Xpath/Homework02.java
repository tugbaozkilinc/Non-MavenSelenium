package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public class Homework02 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //Arama kutusunu locate ediniz
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        //Arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagName = searchBox.getTagName();
        String expectedTagName = "input";
        System.out.println(actualTagName.equals(expectedTagName) ? "TagName test PASSED" : "TagName test FAILED");

        //Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String actualAttributeValue = searchBox.getAttribute("name");
        String expectedAttributeValue = "field-keywords";
        System.out.println(actualAttributeValue.equals(expectedAttributeValue) ? "Attribute value test test PASSED" : "Attribute value test test FAILED");

        //Sayfayı kapatınız
        driver.close();
    }

}
