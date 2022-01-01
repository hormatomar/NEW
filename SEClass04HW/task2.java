package Selenium.SEClass04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    /*task2:(use advance xpath)
    RMS Application Negative Login:
    Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username
    enter wrong password
    Click on login button
    Verify error message with text “Invalid Credenitals” is displayed.*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Book123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        WebElement cannotBeEmpty=driver.findElement(By.cssSelector("span#spanMessage"));
       System.out.println(cannotBeEmpty.getText());

    }
}
