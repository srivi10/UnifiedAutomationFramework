package com.ua.driver;

import com.ua.driver.entity.WebDriverData;

import org.openqa.selenium.WebDriver;

public interface IWebDriver {

    WebDriver getDriver(WebDriverData driverData);
}

