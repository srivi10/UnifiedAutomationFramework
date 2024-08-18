package com.ua.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class iOSLocators {

    public static final By TITLE_PRODUCTS = AppiumBy.xpath("//XCUIElementTypeImage[@name='AppTitle Icons']");
    public static final By MORE_MENU = AppiumBy.xpath("//XCUIElementTypeButton[@name='More-tab-item']");
    public static final By MOREMENU_BIOMETRIC = AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Biometrics-menu-item\"]");



}
