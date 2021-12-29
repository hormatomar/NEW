package Selenium.SEClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        // Switch to the desired frame as our desired webElement is inside that frame
        driver.switchTo().frame("frame1");
        //getting the webElement
        WebElement text1 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is :" + text1.getText());

        //as frame 2 doesn't lie inside frame 1 so in order to get there we need to switch our
        // focus to default page
        driver.switchTo().defaultContent();


        // switch to frame 2
        driver.switchTo().frame("frame2");
        // locate the webElement
        WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is :" + text2.getText());

        //in order to click on webElement "Form"
        //switch the focus back to the default
        driver.switchTo().defaultContent();


    }
}
