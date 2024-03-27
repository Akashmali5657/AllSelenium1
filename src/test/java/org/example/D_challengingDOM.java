package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class D_challengingDOM extends BasicSelenium {

    public static void main(String[] args) {
        initiliseBrowser();

        driver.findElement(By.xpath("//a[contains(text(),'Challenging DOM')]")).click();
        //click on bar
        driver.findElement(By.xpath("//a[@class='button']")).click();
        String value = driver.findElement(By.xpath("//tbody/tr[4]/td[4]")).getText();
        Assert.assertEquals("Definiebas3", value);

        //click on foo
        driver.findElement(By.xpath("//a[@class='button alert']")).click();
        String value1 = driver.findElement(By.xpath("//tbody/tr[4]/td[4]")).getText();
        Assert.assertEquals("Definiebas3", value1);
        System.out.println("Test Passed");

        String attribute = driver.findElement(By.xpath("//canvas[@id='canvas']")).getAttribute("id");
        String text = driver.findElement(By.xpath("//canvas[@id='canvas']")).getText();
        System.out.println("attribute = " + attribute);
        System.out.println("text = " + text);
        System.out.println("Test Passed");
        driver.close();

    }
}
