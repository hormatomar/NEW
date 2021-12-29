package Selenium.SEClass02HW;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*HW2
    navigate to https://www.facebook.com/
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser (edited) */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Walts");
        driver.findElement(By.name("reg_email__")).sendKeys("J.Walts@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("J.Walts@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("John12345");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("1998");
        driver.findElement(By.cssSelector("input[value='2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();








    }
}
