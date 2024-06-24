package com.ua.driver.factory.web.remote;

import com.ua.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.ua.driver.manager.web.remote.selenoid.SelenoidFireFoxManager;
import com.ua.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    private SelenoidFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? SelenoidChromeManager.getDriver()
                : SelenoidFireFoxManager.getDriver();
    }

}
