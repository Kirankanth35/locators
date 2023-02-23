package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locator {
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/login");

       // driver.findElement(By.id("login_field")).sendKeys("2000031801@kluniversity.in");
       // driver.findElement(By.name("password")).sendKeys("Kiran@141007");

        //driver.findElement(By.name("commit")).click();
        //driver.findElement(By.tagName("commit"));

        //driver.findElement(By.linkText("Terms")).click();
       // driver.findElement(By.partialLinkText("Sign up for github")).click();
        WebElement ele =  driver.findElement(By.name("login"));
        //  driver.findElement(By.className("form-control input-block js-login-field")).sendKeys("jitendra12345klu");
        //  driver.findElement(By.id("pass")).sendKeys("Test@1234567890@Test");
        // driver.findElement(By.tagName("button")).click();
        //  driver.findElement(By.linkText("Forgotten account?")).click().highlight();
        //  driver.findElement(By.partialLinkText("Sign up for Facebook")).click();

        highLighterMethod(driver,ele);
        ele.sendKeys("kiran12345klu");
    }
    public void highLighterMethod(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid blue;');", element);
    }
}






