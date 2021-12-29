package Selenium.SEClass06;

import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("button#alert")).click();
        Thread.sleep(3000);

        Alert simpleAlert= driver.switchTo().alert();
        simpleAlert.accept();


        driver.findElement(By.cssSelector("button#confirm"));

        Alert cofirmationAlert=driver.switchTo().alert();

        System.out.println(cofirmationAlert.getText());

        cofirmationAlert.dismiss();

        Thread.sleep(2000);



    }
}
