package com.ua.driver;

import com.ua.config.ConfigFactory;
import com.ua.driver.manager.ChromeManager;
import com.ua.driver.manager.FireFoxManager;
import com.ua.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (ConfigFactory.getConfig().browser() == BrowserType.CHROME) {

            driver = ChromeManager.getDriver();
        } else {

            driver = FireFoxManager.getDriver();
        }
        return driver;
    }

}
