package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dropDown= driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
        dropDown.click();
        WebElement Destination=driver.findElement(By.linkText("Peru"));
        Destination.click();


    }
}
