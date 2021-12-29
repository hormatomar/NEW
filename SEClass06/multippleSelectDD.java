package Selenium.SEClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class multippleSelectDD {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement statesDD= driver.findElement(By.cssSelector("select#multi-select"));

        Select select=new Select(statesDD);

        boolean ismul=select.isMultiple();
        System.out.println(ismul);

        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByVisibleText("Texas");
        Thread.sleep(2000);
        select.selectByValue("Ohio");
        Thread.sleep(2000);
        select.deselectByIndex(2);
        Thread.sleep(2000);
        select.deselectByVisibleText("Texas");

        // to use iterator to get all the options text and print in console

        // get all options
        List<WebElement> options= select.getOptions();

        Iterator<WebElement> it=options.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().getText());
        }
    }
}
