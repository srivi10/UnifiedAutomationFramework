package com.ua.driver;


import org.openqa.selenium.WebDriver;


public class Driver {

    public static void initDriver() {
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://www.google.com/");
    }

    public static void tearDown() {
    }
}
