package com.ua.locators;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;

public class AndroidLocators {

    public static final By TITLE_PRODUCTS = AppiumBy.xpath("//android.widget.TextView[@text='Products']");
    public static final By FLYOUT_MENU = AppiumBy.xpath("//android.widget.ImageView[@content-desc='View menu']");


}
