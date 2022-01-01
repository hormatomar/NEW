package Selenium.SEClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class StaticwebTable {
    public static String url="https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        // print all the rows the webtable in the console

        //1. locate the rows in the table using xpath and save it in a variable
        List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='task-table']/tbody"));
        // print the number of rows
        System.out.println("The number of row in the table are "+tableRows.size());
        // 2. Iterate through each  webElement and get the text out it
        for (WebElement row:tableRows
        ) {
            String text=row.getText();
            System.out.println(text);

        }
        //  print all the headers
       /* List<WebElement> headers=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr"));
        for (WebElement head:headers)   {
            String textHeader=head.getText();
            System.out.println(textHeader);
        }*/
//      iterate through each element and get the text
        List<WebElement> col2=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        for (WebElement col:col2)   {
            System.out.println("the data for column 2 is : "+col.getText());
        }

    }
}
