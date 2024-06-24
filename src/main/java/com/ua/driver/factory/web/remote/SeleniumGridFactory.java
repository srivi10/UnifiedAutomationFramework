package com.ua.driver.factory.web.remote;

import com.ua.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.ua.driver.manager.web.remote.selenium.SeleniumGridFireFoxManager;
import com.ua.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFireFoxManager.getDriver();
    }

}
