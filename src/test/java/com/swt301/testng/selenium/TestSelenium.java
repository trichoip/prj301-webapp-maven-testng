package com.swt301.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {

    @Test
    public void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/input[1]")).sendKeys("admin");
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/input[2]")).sendKeys("1");
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/input[3]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
