package com.ua.locators;

import org.openqa.selenium.By;

public class WebLocators {
    public static final By USERNAME_TEXT_BOX = By.xpath("//input[@name='username']");
    public static final By PASSWORD_TEXT_BOX = By.xpath("//input[@name='password']");
    public static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

    //Menu Locators
    public static final String MENU= "//span[text()='%s']";
    public final By ADMINPAGE=By.xpath("//h6[text()='Admin']");

    //Home Page Locators
    public final By HOMEPAGE =By.xpath("//ul[@class='oxd-main-menu']");
}
