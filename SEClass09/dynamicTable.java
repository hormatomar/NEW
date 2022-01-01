package Selenium.SEClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamicTable {
    public static String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
          //  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
            // print all the rows of the webtable in the console
            // Login to the website
       driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

        // getting all the rows
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        // print all the rows
        for (int i = 1; i <rows.size(); i++) {

            // get the text
           String rowtext= rows.get(i).getText();
            System.out.println(rowtext);
//          check the checkbox if the row has the product screensaver
            if(rowtext.contains("ScreenSaver")) {
                List<WebElement> checkBoxes=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                checkBoxes.get(i-1).click();
            }

        }
    }
}
