package com.ua.pages;

import com.ua.locators.WebLocators;
import com.ua.pages.enums.topmenuComponent.MenuType;
import com.ua.pages.pagecomponents.homepage.TopMenuComponent;
import com.ua.utils.SeleniumPageActionsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class HomePage {
    WebLocators webLocators =new WebLocators();
TopMenuComponent topMenuComponent;

public HomePage(){
    this.topMenuComponent=new TopMenuComponent();
}

public TopMenuComponent getTopMenuComponent(){
    return topMenuComponent;
}


    public void clickMenuItem(MenuType menuType){
        String xpath =String.format(WebLocators.MENU,menuType.getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SeleniumPageActionsHelper.clickElement(By.xpath(xpath));
    }



}
