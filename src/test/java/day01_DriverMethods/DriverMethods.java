package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //Bos bir browser actik
        driver.get("https://www.amazon.com");
        System.out.println("The title is: " + driver.getTitle());
        System.out.println("The current url is: " + driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());
        driver.close();
    }

}
