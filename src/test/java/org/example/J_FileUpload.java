package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class J_FileUpload extends BasicSelenium {
    public static void main(String[] args) {
        initiliseBrowser();

        System.out.println("Upload file test");
        WebElement pageLink = driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));
        pageLink.click();
        WebElement uploadFileLink = driver.findElement(By.cssSelector("input#file-upload"));
        uploadFileLink.sendKeys("C:\\Users\\HP\\Downloads\\SeleniumTesting-master.zip");
        WebElement uploadSubmit = driver.findElement(By.cssSelector("input[type='submit']"));
        uploadSubmit.click();
        Assert.assertEquals("File Uploaded!", driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).getText());
        System.out.println("Test Passed");
    }
}