package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailMessageCounterTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/george/Downloads/Compressed/chromedriver_linux64_3/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.google.com/gmail/");
        System.out.println("Successfully opened the website ");
        driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("georgb5225@gmail.com");
        driver.findElement(By.className("RveJvd snByac")).click();
        driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("@United52");
        driver.findElement(By.className("RveJvd snByac")).click();
      //  driver.findElements(By.className(""))

    }

}
