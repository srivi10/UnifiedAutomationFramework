package com.ua.driver.manager;

import com.ua.config.ConfigFactory;
import com.ua.enums.BrowserRemoteMode;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static void getDriver() {
        if (ConfigFactory.getConfig().browserRemoteMode() == BrowserRemoteMode.SELENIUM) {

        } else if (ConfigFactory.getConfig().browserRemoteMode() == BrowserRemoteMode.SELENOID) {

        }
    }

}
