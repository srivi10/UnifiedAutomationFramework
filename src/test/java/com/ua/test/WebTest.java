package com.ua.test;

import com.ua.config.factory.ConfigFactory;
import com.ua.driver.Driver;
import io.appium.java_client.AppiumBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import com.ua.config.factory.BrowserStackConfigFactory;
import java.time.Duration;

import java.net.MalformedURLException;
import java.net.URL;

public class WebTest extends WebBase{

    @Test
    public void browserLaunch() throws InterruptedException, MalformedURLException {
         //   System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
            Driver.initDriverForWeb();
           }
@Test
    public void appLaunch() throws InterruptedException, MalformedURLException {
        //   System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
        Driver.initDriverForMobile();
    }


}
