package Selenium.SEClass06HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    /*HW1:goto http://syntaxprojects.com/javascript-alert-box-demo.php , handle all alerts one by one
    1.simple 2.confirmation 3.prompt*/
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        //1.Simple
        driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']")).click();
        Thread.sleep(1500);
        Alert alert=driver.switchTo().alert();
        alert.accept();

        //2.confirmation
        driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        //3.prompt
        driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("Hi, how is it going?");
        alert2.accept();


    }
}
