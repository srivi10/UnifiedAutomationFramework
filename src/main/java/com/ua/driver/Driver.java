package com.ua.driver;



import com.ua.driver.entity.DriverData;
import com.ua.driver.entity.MobileDriverData;
import com.ua.driver.entity.WebDriverData;
import com.ua.driver.factory.DriverFactory;
import com.ua.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.ua.config.factory.ConfigFactory.getConfig;

public class Driver {

    private Driver(){}

    public static void initDriverForWeb() throws InterruptedException {
        WebDriverData driverData = WebDriverData.builder().browserType(getConfig().browser()).browserRemoteMode(getConfig().browserRemoteMode()).build();
        WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
        driver.quit();
    }

    public static void initDriverForMobile() throws InterruptedException {
        MobileDriverData driverData = MobileDriverData.builder().mobilePlatformType(MobilePlatformType.ANDROID).mobileRemoteModeType(getConfig().mobileRemoteMode()).build();
        WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(driverData);
        driver.quit();
    }

    public static void tearDown() {
    }
}
