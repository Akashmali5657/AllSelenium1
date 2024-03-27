package org.example;

import org.openqa.selenium.By;

public class E_Checkbox extends BasicSelenium{
    public static void main(String[] args) {
        initiliseBrowser();

        driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        System.out.println("Test Passed");
        driver.quit();
    }
}
