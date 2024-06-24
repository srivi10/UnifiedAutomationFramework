package com.ua.driver.factory.mobile.remote;

import com.ua.enums.MobilePlatformType;
import com.ua.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory() {
    }

    private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP =
            new EnumMap<>(MobileRemoteModeType.class);

    static {
        MAP.put(MobileRemoteModeType.SAUCE_LABS, SauceLabsMobileFactory::getDriver);
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
    }

    public static WebDriver getDriver(MobileRemoteModeType browserRemoteModeType,
                                      MobilePlatformType browserType) {
        return MAP.get(browserRemoteModeType).apply(browserType);
    }

}
