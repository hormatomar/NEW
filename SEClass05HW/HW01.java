package Selenium.SEClass05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

        /*HW1: Amazon link count:
        Open chrome browser
        Go to “https://www.amazon.com/”
        Get all links
        Get number of links that has text
        Print to console only the links that has text*/

public class HW01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        //Get all links
        List<WebElement> links=driver.findElements(By.tagName("a"));

        for(WebElement link:links) {
            String getLink=link.getAttribute("href");
            System.out.println(getLink);
        }
        System.out.println("*************");
        //Get number of links that has text
        System.out.println("The number of links on Amazon: "+links.size());
        System.out.println("***************");
        //Print to console only the links that has text
        for(WebElement textLink:links)  {
            String getTextLink=textLink.getText();

            if(!getTextLink.isEmpty()) {
                String linkHasText=textLink.getAttribute("href");
                System.out.println(linkHasText);
            }
        }
        driver.quit();


    }
}
