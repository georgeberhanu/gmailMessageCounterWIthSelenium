package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class gmailMessageCounterTest {

    public static void main(String[] args) throws InterruptedException, IOException {
        //Tesfaye Berhanu ...ATR/4668/09.....Sectio:3


        System.setProperty("webdriver.chrome.driver","/home/george/Downloads/Compressed/chromedriver_linux64_3/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("http://mail.google.com");
        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("email");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
        Thread.sleep(10000);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        pass.click();
        pass.sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();

        Thread.sleep(1000);
        List<WebElement> unread = driver.findElements(By.xpath("//*[@class='zA zE']"));
        System.out.println(unread.size() + " Unread Messages");
        FileWriter fw=new FileWriter("test.txt");
        for (WebElement message: unread  ) {
            System.out.println(message.getText());
            fw.write(message.getText()+"\n");

        }
        fw.close();
    }

}
