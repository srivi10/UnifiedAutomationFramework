package com.ua.driver;



import com.ua.driver.entity.DriverData;
import com.ua.driver.factory.DriverFactory;
import com.ua.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.ua.config.factory.ConfigFactory.getConfig;

public class Driver {

    private Driver(){}

    public static void initDriverForWeb() throws InterruptedException {
        //WebDriver driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.ANDROID);
        //WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        //WebDriver driver = RemoteDriverFactory.getDriver(getConfig().browserRemoteMode(), getConfig().browser());
        //WebDriver driver = RemoteMobileDriverFactory.getDriver(getConfig().mobileRemoteMode(),MobilePlatformType.ANDROID);
        DriverData driverData = DriverData.builder().browserType(getConfig().browser()).browserRemoteMode(getConfig().browserRemoteMode()).runModeType(getConfig().browserRunMode()).build();
        WebDriver driver = DriverFactory.getDriverForWeb(driverData);
        driver.quit();
    }

    public static void initDriverForMobile() throws InterruptedException {
        DriverData driverData = DriverData.builder().mobilePlatformType(MobilePlatformType.ANDROID).mobileRemoteModeType(getConfig().mobileRemoteMode()).runModeType(getConfig().mobileRunMode()).build();
        WebDriver driver = DriverFactory.getDriverForMobile(driverData);
        driver.quit();
    }

    public static void tearDown() {
    }
}
