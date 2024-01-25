package CodingAssignment9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MusicConcertapageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaconcertreg.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the submission with empty fields:
        WebElement l1= driver.findElement(By.cssSelector("input:nth-child(4)"));
        l1.sendKeys("Charlie");
        WebElement l2= driver.findElement(By.cssSelector("button[class='btn']"));
        l2.click();
        Alert a1=driver.switchTo().alert();
        System.out.println(a1.getText());
        a1.accept();
        //Test the successful submission:
        WebElement l3= driver.findElement(By.cssSelector("input:nth-child(6)"));
        l3.sendKeys("charlie@gmail.com");
        WebElement l4= driver.findElement(By.cssSelector("button[class='btn']"));
        l4.click();
        Alert a2=driver.switchTo().alert();
        System.out.println(a2.getText());
        a2.accept();
        //Test the valid passcode submission:
        WebElement l5= driver.findElement(By.cssSelector("input:nth-child(2)"));
        l5.sendKeys("123456");
        WebElement l6= driver.findElement(By.cssSelector("button[class='btn']"));
        l6.click();
        Alert a3=driver.switchTo().alert();
        a3.accept();
        System.out.println(a3.getText());
        a3.accept();
        a3.sendKeys("foodmunch");
        a3.accept();
        System.out.println("Gift Voucher Issued");
    }
}
