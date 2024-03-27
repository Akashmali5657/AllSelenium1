package org.example;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class H_Dropdown extends BasicSelenium{
    public static void main(String[] args) {
        initiliseBrowser();

        driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
        
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByValue("2");

        List<WebElement> dropdownList = select.getOptions();
        for (int i=0; i<dropdownList.size();i++){
            System.out.println(dropdownList.get(i).getText());
        }

        System.out.println("Test Passed");
        driver.close();

    }
}
