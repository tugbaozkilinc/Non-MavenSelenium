package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //Bos bir browser actik
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        System.out.println("The title is: " + driver.getTitle());
        System.out.println("The current url is: " + driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        driver.close();
    }

}
