package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

import static java.nio.channels.FileChannel.open;

public class B_BsicAuth extends BasicSelenium{
    public static void main(String[] args)  {
        BasicSelenium.initiliseBrowser();

        String username = "admin";
        String password = "admin";
        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
        String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
        Assert.assertEquals("Congratulations! You must have the proper credentials.",text);
        driver.close();
        System.out.println("Test Passed");
    }

}
