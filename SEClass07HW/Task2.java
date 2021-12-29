package Selenium.SEClass07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    /* goto https://demoqa.com/nestedframes
    print the text childframe on console (edited) */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");

        WebElement childFrame = driver.findElement(By.xpath("//iframe[contains(@srcdoc, 'Child')]"));
        driver.switchTo().frame(childFrame);

        WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(text.getText());

    }
}
