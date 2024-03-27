package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasicSelenium {
     static WebDriver driver;
    public static void main(String[] args) {

        initiliseBrowser();
        String expectedTitle = "The Internet";
        String actualTitle = "";

        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }

    public static void initiliseBrowser() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium2\\Drivers\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        // launch Fire fox and direct it to the Base URL
        driver.get("http://the-internet.herokuapp.com/?ref=hackernoon.com");
    }
}
