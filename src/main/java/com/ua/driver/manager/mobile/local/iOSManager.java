package com.ua.driver.manager.mobile.local;

import com.ua.config.factory.ConfigFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSManager {

    private iOSManager() {
    }

    public static WebDriver getDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 13 Pro Max")
                .setApp(System.getProperty("user.dir") + "/ios-app.zip");
        return new IOSDriver(ConfigFactory.getConfig().localAppiumServerURL(), options);
    }
}
