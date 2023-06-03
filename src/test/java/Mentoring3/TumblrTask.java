package Mentoring3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
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


    }
}