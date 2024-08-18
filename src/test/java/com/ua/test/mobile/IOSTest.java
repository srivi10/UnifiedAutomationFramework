package com.ua.test.mobile;

import com.ua.locators.iOSLocators;
import com.ua.test.mobile.base.MobileBase;
import com.ua.utils.AppiumActionsHelper;
import org.junit.Test;

public class IOSTest extends MobileBase {
  @Test
    public void testLoginIOS(){
    AppiumActionsHelper.validateElementPresent(iOSLocators.TITLE_PRODUCTS);
    AppiumActionsHelper.clickElement(iOSLocators.MORE_MENU);
    AppiumActionsHelper.validateElementPresent(iOSLocators.MOREMENU_BIOMETRIC);
  }

}
