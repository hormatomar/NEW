package Selenium.SEClass01HW;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Hormat");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Omar");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("300 Fairfax Rd");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22039");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+15711002299");
        driver.findElement(By.id("customer.ssn")).sendKeys("321444333");
        driver.findElement(By.id("customer.username")).sendKeys("hormatomar");
        driver.findElement(By.id("customer.password")).sendKeys("Omar111");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Omar111");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        Thread.sleep(6000);
        driver.quit();

    }
}
