package com.ua.driver.factory;

import com.ua.driver.entity.DriverData;
import com.ua.driver.factory.local.mobile.LocalMobileDriverFactory;
import com.ua.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.ua.driver.factory.web.local.LocalDriverFactory;
import com.ua.driver.factory.web.remote.RemoteDriverFactory;
import com.ua.enums.RunModeType;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriverForWeb(DriverData driverData) {
        if (driverData.getRunModeType() == RunModeType.LOCAL) {
            return LocalDriverFactory.getDriver(driverData.getBrowserType());
        } else {
            return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteMode(), driverData.getBrowserType());
        }

    }

    public static WebDriver getDriverForMobile(DriverData driverData) {
        if (driverData.getRunModeType() == RunModeType.LOCAL) {
            return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
        } else {
            return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(), driverData.getMobilePlatformType());
        }
    }
}
