package com.ua.driver.manager.mobile.local;

import com.ua.config.factory.ConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Platform;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class AndroidManager {
    private AndroidManager() {
    }

    public static WebDriver getDriver() {

        try {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setUdid("emulator-5554")
                    .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                    .setDeviceName("Pixel 3a API 34")
                    .setApp("/Users/srivi/Downloads/SoftwareSetup/TestApps/Android/mda-2.0.2-23.apk");
            Thread.sleep(5000);
            return new AndroidDriver(new URL("http://10.0.0.201:4723"), options);
        } catch (SessionNotCreatedException | InterruptedException e) {
            System.out.println("Error creating new session: " + e.getMessage());
            return null;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
