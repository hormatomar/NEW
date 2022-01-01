package Selenium.SEClass04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
    public static void main(String[] args) {

        /*task3:(use css)
        goto:http://syntaxprojects.com/input-form-demo.php
        fill in all the textboxes in the form  */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Hormat");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Omar");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("h.omar@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("(466)3336677");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("123 Fairoak lane");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Fairfax");
        driver.findElement(By.xpath("//select[@name='state']")).sendKeys("Virginia");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("22317");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.Testing.com");
        driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]")).click();
        driver.findElement(By.xpath("//textarea")).sendKeys("We will rock!");


    }
}
