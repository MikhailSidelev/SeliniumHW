package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumHW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/challenge/pwd?elo=1&ifkv=AYZoVhesDpKXQLdQeTBfjdjS7RJ_oPIpcxW5_g3BgBJj0D-8GGaTcNwE_gI-kesBk79vIJl1hnfH1A&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AJeL0C4d3nt34uQ36ZpT5IzJr9hXYChXpli8M_AUP_1RJvOhfERsPkQ873DzMEka");
        driver.manage().window().maximize();

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();
        Set<String> allHandles = driver.getWindowHandles();
        // loop through all the handles and find the one that is desired
        for(String handle:allHandles){
            //switch to the first handle in list
            driver.switchTo().window(handle);
            // get the title of the window on which the focus is
            String title = driver.getTitle();

            // check if the title matches our desired title, if yes break the loop if not repeat the process
            if (title.equalsIgnoreCase("Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }
}
