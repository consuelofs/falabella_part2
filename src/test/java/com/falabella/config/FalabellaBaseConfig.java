package com.falabella.config;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FalabellaBaseConfig {

    public WebDriver driver;

    @Before()
    public void getDriver() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.falabella.com/falabella-cl/");
        //
        System.out.println("Successfully opened the website https://www.falabella.com/falabella-cl/");
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
