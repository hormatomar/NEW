package Selenium.SEClass08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1_1 {
    public static void main(String[] args) {
        /*goto http://syntaxprojects.com/window-popup-modal-demo.php
          click on follow on instagram
          get the title and of new window and print it on the console
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        //driver.manage().window().maximize();
        WebElement instagram = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        instagram.click();

        String parentHandle = driver.getWindowHandle();
        //driver.switchTo().window(parentHandle);

        Set<String> allHandles = driver.getWindowHandles();
        Iterator<String> iterator = allHandles.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            driver.switchTo().window(childWindow);


            if (!parentHandle.equalsIgnoreCase(childWindow)) {
                System.out.println(driver.getTitle());
                break;
            }
            System.out.println(driver.getTitle());
        }

    }
}
