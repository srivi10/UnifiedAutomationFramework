package com.ua.driver.factory.web.remote;

import com.ua.driver.manager.web.remote.browserStack.BrowserStackChromeManager;
import com.ua.driver.manager.web.remote.browserStack.BrowserStackFirefoxManager;
import com.ua.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class BrowserStackFactory {
    private BrowserStackFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, BrowserStackFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }

}
