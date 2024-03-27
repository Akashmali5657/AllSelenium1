package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class G_DragAndDrop extends BasicSelenium{
    public static void main(String[] args) {
        initiliseBrowser();

        driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
        WebElement elementA = driver.findElement(By.xpath("//div[@id='column-a']"));
        System.out.println(elementA.getAttribute("id"));
        WebElement elementB = driver.findElement(By.xpath("//div[@id='column-b']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementA, elementB).build().perform();
        System.out.println("Test Passed");
        String text = driver.findElement(By.xpath("//header")).getText();
        System.out.println(text);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.quit();
    }
}
