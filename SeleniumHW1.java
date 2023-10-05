package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

//        click on the checkBox
//        using the name or id method
        driver.switchTo().frame("checkboxIframe");

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

//        create object of select class and pass in the dd element
        Select sel =new Select(dropDown);

//        use any method out of index()  , visibleTExt, byValue to select ur desried option

        sel.selectByIndex(1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("HairBall");



    }
}
