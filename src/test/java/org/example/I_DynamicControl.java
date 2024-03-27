package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class I_DynamicControl extends BasicSelenium {
    public static void main(String[] args) {
        initiliseBrowser();

        driver.findElement(By.xpath("//a[contains(text(),'Dynamic Controls')]")).click();
        WebElement add = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        WebElement remove = driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        if (checkbox.isDisplayed()) {
            checkbox.click();
        } else if (remove.isDisplayed()) {
            remove.click();
        } else if (add.isDisplayed()) {
            add.click();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.close();
    }
}
