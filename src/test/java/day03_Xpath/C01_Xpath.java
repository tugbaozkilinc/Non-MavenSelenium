package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {

        // Note: Diger 6 locator HTML koduna baglidir; web elementin kodunda id yoksa By.id() methodunu web element link degilse By.linkText() methodunu kullanamazsiniz.
        // xpath() ise dinamiktir. Her turlu web element icin mutlaka bir xpath yazilabilir.

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        // driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        WebElement addButton = driver.findElement(By.xpath("//*[text()='Add Element']")); //xpath kullaniminda locate edecegimiz web element text e sahipse bu sekilde kullanabiliriz.
        addButton.click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButton.isDisplayed()){
            System.out.println("That Delete button is displayed PASSED");
        } else {
            System.out.println("That Delete button is displayed FAILED");
        }

        // 4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

        // 5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3"));
        if(addRemoveElement.isDisplayed()){
            System.out.println("That Delete button is displayed PASSED");
        }else {
            System.out.println("That Delete button is displayed FAILED");
        }

    }
}
