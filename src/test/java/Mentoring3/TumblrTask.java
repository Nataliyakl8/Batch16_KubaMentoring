package Mentoring3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TumblrTask {

    @Test()
    public void tC_07() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote -allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tumblr.com/");

        /*
        CodeFish 16
        2:39 PM
        Navigate to webapp
        click login button
        click continue with email button
        provide email, and password (wrong credentials)
        and validate the error message
        driver quit*/

        WebElement logIn= driver.findElement(By.linkText("Log in"));
        logIn.click();

        WebElement continueWEmail= driver.findElement(By.xpath("//button[@class='dKGjO']"));
        continueWEmail.click();

        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("mail@mail.com");

        WebElement nextButton= driver.findElement(By.xpath("//button[@aria-label='Next']"));
        nextButton.click();

        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("123");

        WebElement logIn2=driver.findElement(By.xpath("//button[@aria-label='Log in']"));
        logIn2.click();

        WebElement popUp=driver.findElement(By.cssSelector(".hAkP2"));//a0A37 hAkP2
        System.out.println(popUp.getText());




    }
}