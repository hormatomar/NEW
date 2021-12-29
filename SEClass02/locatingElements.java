package Selenium.SEClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {


    public static void main (String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com");

        driver.findElement(By.id("email")).sendKeys("hormatomar@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Syntax12345");
      //  driver.findElement(By.name("login")).click();
      //  driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}

