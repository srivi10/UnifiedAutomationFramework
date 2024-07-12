package com.ua.driver;

import com.ua.driver.entity.WebDriverData;
import com.ua.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
      return   RemoteDriverFactory.getDriver(driverData.getBrowserRemoteMode(), driverData.getBrowserType());
    }
}
