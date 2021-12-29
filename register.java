package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=5C1593A43E56843A298EA7FE7B72208C");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Hormat");
        driver.findElement(By.id("customer.lastName")).sendKeys("Omar");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();



    }
}
