package com.falabella.config;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseConfig {

    public WebDriver driver;

    @Before()
    public void getDriver() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.google.com/");
        //
        System.out.println("Successfully opened the website https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After()
    public void teardownTest() {
        // Close browser and end the session
        driver.quit();
    }

}
