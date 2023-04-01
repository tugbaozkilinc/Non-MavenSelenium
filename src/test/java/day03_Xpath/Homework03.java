package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework03 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com ");

        //2. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        //3. Login alanina  "username" yazdirin
        driver.findElement(By.cssSelector("input[id='user_login']")).sendKeys("username");

        //4. Password alanine "password" yazdirin
        driver.findElement(By.cssSelector("input[id='user_password']")).sendKeys("password");

        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();
        driver.navigate().back();

        //6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.cssSelector("li[id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//*[text()='Pay Bills']")).click();

        //7. Amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.xpath("//*[@id='sp_amount']")).sendKeys("5");

        //8. tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.cssSelector("input[id='sp_date']")).sendKeys("2020-09-10");

        //9. Pay buttonuna tiklayin
        driver.findElement(By.cssSelector("input[id='pay_saved_payees']")).click();

        //10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
        WebElement element = driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']"));
        String result = element.isDisplayed() ? "That the element is displayed PASSED" : "That the element is displayed FAILED";
        System.out.println(result);

        driver.close();
    }

}
