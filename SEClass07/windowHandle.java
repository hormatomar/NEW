package Selenium.SEClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

        //get hte address/handle of the page/window
        String signUpPageHandle=driver.getWindowHandle();
        System.out.println("The Window handle for signup page is : "+signUpPageHandle);
        //click on help
        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termBtn=driver.findElement(By.xpath("//a[text()='Term']"));
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));

        // click on them to open up new Windows
        helpBtn.click();
        termBtn.click();
        privacyBtn.click();
        // we havent
        //to get all the windows handles
        Set<String> allWindowHandles=driver.getWindowHandles();
        //print the size of allWindowHandles
        System.out.println("number of window handles is :"+allWindowHandles);
        //inorder to print all window handles we need to iterate over the SET
        Iterator<String> it=allWindowHandles.iterator();

        signUpPageHandle=it.next();
        String helpPageHandle=it.next();
        String termPageHandle=it.next();
        String privacyPageHandle=it.next();

        System.out.println("The handle for signup page is :"+signUpPageHandle);
        System.out.println("The handle for help page is :"+helpPageHandle);
        System.out.println("The handle for term page is :"+termPageHandle);
        System.out.println("The handle for privacy page is :"+privacyPageHandle);

        // switch to help page
        driver.switchTo().window(privacyPageHandle);
        System.out.println(driver.getTitle());

    }
}
