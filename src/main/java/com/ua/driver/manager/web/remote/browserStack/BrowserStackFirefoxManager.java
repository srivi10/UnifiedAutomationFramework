package com.ua.driver.manager.web.remote.browserStack;

import com.ua.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackFirefoxManager {
    private BrowserStackFirefoxManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browser", "chrome");
        capabilities.setCapability("browser_version", "latest");
        capabilities.setCapability("os", "Windows");
        capabilities.setCapability("os_version", "10");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
    }
}
