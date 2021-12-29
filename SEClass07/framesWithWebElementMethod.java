package Selenium.SEClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesWithWebElementMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
//      Switch to the desired frame using WebElement
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);

        //Swithc to default
        driver.switchTo().defaultContent();

        // Switch to the frame using Index
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.cssSelector("h1#sampleHeading")).getText());




    }
}
