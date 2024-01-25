package CodingAssignment9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreasureHuntPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qatreasurehunt.ccbp.tech/");
        driver.manage().window().maximize();
       WebElement el= driver.findElement(By.cssSelector("a:last-child"));
       el.click();
       Alert alert=driver.switchTo().alert();
       System.out.println(alert.getText());
       alert.accept();
       alert.sendKeys("Expecto Patronum");
       alert.accept();
       System.out.println(alert.getText());
       alert.accept();
       WebElement el2=driver.findElement(By.cssSelector("a:last-child"));
       Alert alert1=driver.switchTo().alert();
       alert1.sendKeys("Expelliarmus");
       System.out.println(alert1.getText());
       alert1.accept();

    }
}
