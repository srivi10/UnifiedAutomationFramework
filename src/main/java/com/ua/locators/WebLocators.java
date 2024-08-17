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
    public final By PIMPAGE=By.xpath("//h6[text()='PIM']");
    public final By LEAVEPAGE=By.xpath("//h6[text()='Leave']");
    public final By TIMEPAGE=By.xpath("//h6[text()='Time']");
    public final By RECRUITMENTPAGE=By.xpath("//h6[text()='Recruitment']");
    public final By MYINFOPAGE=By.xpath("//img[@class='employee-image' and @alt='profile picture']");

    public final By PERFORMANCEPAGE =By.xpath("//h6[text()='Performance']");
    public final By DASHBOARDPAGE=By.xpath("//h6[text()='Dashboard']");
    public final By DIRECTORYPAGE=By.xpath("//h6[text()='Directory']");

}
