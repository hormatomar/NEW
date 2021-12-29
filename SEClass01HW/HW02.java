package Selenium.SEClass01HW;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2500);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Walker");
        driver.findElement(By.name("reg_email__")).sendKeys("JohnWalker@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("JohnWalker@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("jfdlksa1234");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("26");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        driver.findElement(By.cssSelector("input[value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        Thread.sleep(3500);
        driver.quit();

    }
}
