package com.ua.driver.factory.web.remote;

import com.ua.enums.BrowserRemoteMode;
import com.ua.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteDriverFactory {
    private RemoteDriverFactory() {
    }

    private static final Map<BrowserRemoteMode, Function<BrowserType, WebDriver>> MAP =
            new EnumMap<>(BrowserRemoteMode.class);

    static {
        MAP.put(BrowserRemoteMode.SELENIUM, SeleniumGridFactory::getDriver);
        MAP.put(BrowserRemoteMode.SELENOID, SelenoidFactory::getDriver);
        MAP.put(BrowserRemoteMode.BROWSER_STACK, BrowserStackFactory::getDriver);
    }

    public static WebDriver getDriver(BrowserRemoteMode browserRemoteModeType,
                                      BrowserType browserType) {
        return MAP.get(browserRemoteModeType).apply(browserType);
    }

}
