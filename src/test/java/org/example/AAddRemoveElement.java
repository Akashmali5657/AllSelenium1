package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AAddRemoveElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("http://the-internet.herokuapp.com/?ref=hackernoon.com");

        driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete']")));
        element.click();
        System.out.println("Test Passed");
        driver.close();
    }
}
