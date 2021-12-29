package Selenium.SEClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingtext {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        WebElement alertlink= driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alertlink.click();
    }
}
