package Selenium.SEClass07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {

    /*goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
    click on follow on instagram
    click on facebook.com
    get all windows handles*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement instagramBtn=driver.findElement(By.xpath("//a[@href='https://www.instagram.com/Syntaxtechs/']"));
        instagramBtn.click();

        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        WebElement facebookBtn=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));
        facebookBtn.click();
        Set<String> allWindowHandles=driver.getWindowHandles();
        //print the size of allWindowHandles
        System.out.println("Number of window handles are :"+allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();
        String instagramHandle=it.next();
        String facebookHandle=it.next();

        System.out.println("The handle for Instagram page is :"+instagramHandle);
        System.out.println("The handle for Facebook page is :"+facebookHandle);


    }
}
