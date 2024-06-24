package com.ua.driver.manager.mobile.local;

import com.ua.config.factory.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSManager {

    private iOSManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 15 Pro");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/android.apk");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities);
    }
}
