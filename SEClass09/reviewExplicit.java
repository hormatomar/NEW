package Selenium.SEClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class reviewExplicit {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//      locate the enable after 10 sec button and click on it
        WebElement enableBtn=driver.findElement(By.cssSelector("button#enable-button"));
        enableBtn.click();

        // print the state of the button after it is enabled
        WebDriverWait wait=new WebDriverWait(driver, 20);
        // condition
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button@disable")));
        // printwether the button is enabled or not
        driver.findElement(By.cssSelector("button#disabled"));
        WebElement btn=driver.findElement(By.cssSelector("button#disabled"));
        boolean status=btn.isEnabled();
        System.out.println(status);

    }
}
