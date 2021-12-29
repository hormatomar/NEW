package Selenium.SEClass07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // the actual url:http//accounts.google.com/signup
        // if you want to pass in password and username then incorporate it inside the url
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
