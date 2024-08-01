package com.ua.driver;

import com.ua.enums.PlatformType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

import static com.ua.enums.PlatformType.MOBILE;
import static com.ua.enums.PlatformType.WEB;

public final class DriverManager {

    private DriverManager(){}

    private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> MOBILE_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<PlatformType> CONTEXT = ThreadLocal.withInitial(() -> PlatformType.WEB);
    private static final Map<PlatformType, ThreadLocal<WebDriver>> Driver_MAP = new EnumMap<>(PlatformType.class);

    public static WebDriver getDriver() {
        return CONTEXT.get() == WEB
                ? WEB_DRIVER_THREAD_LOCAL.get()
                : MOBILE_DRIVER_THREAD_LOCAL.get();

    }

    public static void setDriver(WebDriver driver) {
        if (isMobileDriver(driver)) {
            MOBILE_DRIVER_THREAD_LOCAL.set(driver);
            CONTEXT.set(MOBILE);
            Driver_MAP.put(MOBILE, MOBILE_DRIVER_THREAD_LOCAL);
            CONTEXT.set(MOBILE);
        } else {
            WEB_DRIVER_THREAD_LOCAL.set(driver);
            Driver_MAP.put(WEB, WEB_DRIVER_THREAD_LOCAL);
            CONTEXT.set(WEB);
        }

    }

    private static boolean isMobileDriver(WebDriver driver) {
        return driver instanceof AndroidDriver || driver instanceof IOSDriver;
    }

    public static void unload() {
        WEB_DRIVER_THREAD_LOCAL.remove();
        MOBILE_DRIVER_THREAD_LOCAL.remove();
        CONTEXT.remove();

    }
}
