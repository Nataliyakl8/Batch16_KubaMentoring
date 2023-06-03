package Mentoring3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Sliders {

    @Test()
    public void tC_06() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote -allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.lambdatest.com/selenium-playground");

        WebElement drag= driver.findElement(By.linkText("Drag & Drop Sliders"));
        drag.click();

        List<WebElement> allSliders=driver.findElements(By.xpath("//input[@type='range']"));
        List<WebElement> allOutput=driver.findElements(By.cssSelector("output"));


        for (int i=0;i<allSliders.size();i++){

            while(!allOutput.get(i).getText().equals("50")){
                if(allOutput.get(i).getText().equals("85")){
                    break;
                }else
                        {allSliders.get(i).sendKeys(Keys.ARROW_RIGHT);

                        }


        }



    }
}}