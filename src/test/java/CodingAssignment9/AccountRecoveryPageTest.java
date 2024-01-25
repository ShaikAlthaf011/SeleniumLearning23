package CodingAssignment9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountRecoveryPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaaccrecovery.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the submission with empty fields:
        WebElement el1= driver.findElement(By.cssSelector("input:nth-child(2)"));
        el1.sendKeys("Bob");
        WebElement el2= driver.findElement(By.cssSelector("input:nth-child(5)"));
        el2.submit();
        Alert a1=driver.switchTo().alert();
        System.out.println(a1.getText());
        a1.accept();
        //Test the successful submission:
        WebElement el3= driver.findElement(By.cssSelector("input:nth-child(4)"));
        el3.sendKeys("bob@gmail.com");
        WebElement el4= driver.findElement(By.cssSelector("input:nth-child(5)"));
        el4.click();
        Alert a2=driver.switchTo().alert();
        System.out.println(a2.getText());
        a2.accept();
        //Test the confirmation for resending OTP:
        WebElement el5= driver.findElement(By.cssSelector("a:last-child"));
        el5.click();
        Alert a3=driver.switchTo().alert();
        System.out.println(a3.getText());
        a3.accept();
        a3.accept();
        //Test the successful OTP submission:
        WebElement el6= driver.findElement(By.cssSelector("input:nth-child(2)"));
        el6.sendKeys("123456");
        WebElement el7= driver.findElement(By.cssSelector("input:nth-child(3)"));
        el7.click();
       System.out.println("Account Recovered");
    }
}
