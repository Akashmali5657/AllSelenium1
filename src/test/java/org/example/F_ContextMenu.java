package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class F_ContextMenu extends BasicSelenium{
    public static void main(String[] args) {
        initiliseBrowser();

        driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();

        WebElement contextBox = driver.findElement(By.cssSelector("div[contextmenu='menu']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(contextBox);
        actions.contextClick(contextBox).build().perform();

        WebElement menuItem = driver.findElement(By.cssSelector("menuitem[label='the-internet']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", menuItem);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.switchTo().alert().accept();

        System.out.println("Test Passed");
        driver.close();
    }
}
