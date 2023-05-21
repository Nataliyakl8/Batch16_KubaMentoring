package lambda_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.StackTrace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

   @Test()
   public void test1(){
       WebDriverManager.chromedriver().setup();
       ChromeOptions options= new ChromeOptions();
       options.addArguments("--remote -allow-origins=*");


       WebDriver driver= new ChromeDriver(options);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.lambdatest.com/selenium-playground");

       WebElement input = driver.findElement(By.xpath("//a[contains(text(),'Input Form Submit')]"));
       input.click();

       WebElement name= driver.findElement(By.xpath("//input[@id='name']"));
       name.sendKeys("Nata");

       WebElement email= driver.findElement(By.xpath("//input[@id='inputEmail4']"));
       email.sendKeys("Nata@mail.com");

       WebElement passcode= driver.findElement(By.xpath("//input[@id='inputPassword4']"));
       passcode.sendKeys("Nata8");

       WebElement company= driver.findElement(By.xpath("//input[@id='company']"));
       company.sendKeys("CodeFish");

       WebElement webSite= driver.findElement(By.xpath("//input[@id='websitename']"));
       webSite.sendKeys("www.CodeFish.com");

       WebElement country= driver.findElement(By.xpath("//select[@name='country']"));
       country.sendKeys("United states");

       WebElement city = driver.findElement(By.xpath("//input[@id='inputCity']"));
       city.sendKeys("chicago");



       WebElement address = driver.findElement(By.xpath("//input[@id='inputAddress1']"));
       address.sendKeys("2655 smith st");

       WebElement address1 = driver.findElement(By.xpath("//input[@id='inputAddress2']"));
       address1.sendKeys("108");

       WebElement state = driver.findElement(By.xpath("//input[@id='inputState']"));
       state.sendKeys("IL");

       WebElement zip = driver.findElement(By.xpath("//input[@id='inputZip']"));
       zip.sendKeys("60634");

       //

       WebElement button  = driver.findElement(By.cssSelector(".selenium_btn "));
      button.click();

      WebElement text =driver.findElement(By.cssSelector(".success-msg"));
        String actual=text.getText();
        String expected ="Thanks for contacting us, we will get back to you shortly.";

       Assert.assertEquals(actual,expected);













   }




}
