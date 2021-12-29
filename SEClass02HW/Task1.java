package Selenium.SEClass02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
        /*HW1
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Hormat");
        driver.findElement(By.id("customer.lastName")).sendKeys("Omar");
        driver.findElement(By.id("customer.address.street")).sendKeys("1200 Awesome St");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("23045");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+15712205566");
        driver.findElement(By.id("customer.ssn")).sendKeys("8441234545");
        driver.findElement(By.id("customer.username")).sendKeys("hormatomar");
        driver.findElement(By.id("customer.password")).sendKeys("Syntax123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Syntax123");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
