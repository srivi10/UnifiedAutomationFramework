package com.ua.test.mobile;

import com.ua.driver.DriverManager;
import com.ua.locators.AndroidLocators;
import com.ua.test.mobile.base.MobileBase;
import org.junit.Test;
import com.ua.utils.AppiumActionsHelper;

public class AndroidTest extends MobileBase {
    @Test
    public void validateHomePage() {
        AppiumActionsHelper.validateElementPresent(AndroidLocators.TITLE_PRODUCTS);
        AppiumActionsHelper.clickElement(AndroidLocators.FLYOUT_MENU);
    }
}
