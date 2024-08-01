package com.ua.pages.pagecomponents.homepage;

import com.ua.pages.enums.topmenuComponent.MenuType;
import com.ua.utils.SeleniumPageActionsHelper;
import org.openqa.selenium.By;

public class TopMenuComponent {

    private static final String MENU= "//span[text()='%s']";

    public void clickMenuItem(MenuType menuType){
        String xpath =String.format(MENU,menuType.getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SeleniumPageActionsHelper.clickElement(By.xpath(xpath));
    }
}
