package com.ua.driver;

import com.ua.driver.entity.MobileDriverData;
import com.ua.driver.entity.WebDriverData;
import com.ua.driver.factory.DriverFactory;
import com.ua.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.ua.config.factory.ConfigFactory.getConfig;

public class Driver {

    private Driver() {
    }

    public static void initDriverForWeb() throws InterruptedException {
        if(DriverManager.getDriver() == null){
        WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
        WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
        DriverManager.setDriver(driver);
    }}

    public static void initDriverForMobile() throws NullPointerException {

            MobileDriverData driverData = new MobileDriverData(MobilePlatformType.IOS, getConfig().mobileRemoteMode());
            WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(driverData);
            DriverManager.setDriver(driver);
    }

    public static void quitDriver() {
        if(DriverManager.getDriver() != null) {
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }}
}
