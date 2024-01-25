package CodingAssignment9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConferenceRegistrationPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaconfreg.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1= driver.findElement(By.cssSelector("input:nth-child(2)"));
        el1.sendKeys("Alice");
        WebElement el2= driver.findElement(By.cssSelector("input:nth-child(5)"));
        el2.click();
        Alert a1=driver.switchTo().alert();
        System.out.println(a1.getText());
        a1.accept();
        WebElement el3= driver.findElement(By.cssSelector("input:nth-child(4)"));
        el3.sendKeys("Alice@gmail.com");
        WebElement el4= driver.findElement(By.cssSelector("input:nth-child(5)"));
        el4.click();
        Alert a2=driver.switchTo().alert();
        System.out.println(a2.getText());
        a2.accept();
    }
}
