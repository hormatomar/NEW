package Selenium.SEClass05HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {

    /*HW3
    Go to facebook
    click on create new account  page
    Fill out the whole form
    Click signup*/

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //Continue ...
    }
}
