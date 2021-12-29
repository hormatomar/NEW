package Selenium.SEClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        // declaring an implicit wait for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // find the button to get new user
        WebElement getNewUser=driver.findElement(By.cssSelector("button#startButton"));
        // click on button
        getNewUser.click();
        // get new user first name
        WebElement name=driver.findElement(By.xpath("//div[@id='finish']/h4"));
        Thread.sleep(6000);
        System.out.println(name.getText());
    }
}
