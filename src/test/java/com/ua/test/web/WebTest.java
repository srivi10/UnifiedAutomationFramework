package com.ua.test.web;

import com.ua.locators.WebLocators;
import com.ua.pages.HomePage;
import com.ua.pages.LoginPage;
import com.ua.pages.enums.topmenuComponent.MenuType;
import com.ua.utils.WebJsonUtil;
import com.ua.utils.WebJsonUtil.Credentials;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.Map;

import com.ua.utils.SeleniumPageActionsHelper;
import org.junit.jupiter.api.Order;

public class WebTest extends WebBase {
    private WebJsonUtil.CredentialSet credentialSet;
    private WebJsonUtil.Credentials credentials;
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    WebLocators webLocators = new WebLocators();

    //HRM Tool tests
    @Before
    public void setUP() {
        super.setUP();
        WebJsonUtil webJsonUtil = new WebJsonUtil();
        credentialSet = webJsonUtil.readCredentialSet("webTestData.json");
        // Select user type dynamically
        String userType = "admin"; // or "manager" or "employee"
        Map<String, Credentials> users = credentialSet.getUsers();
        credentials = users.get(userType);
        loginPage.loginTOApplication(credentials.getUsername(), credentials.getPassword());
    }

    @Test
    @Order(1)
    public void loginHRM() throws InterruptedException, MalformedURLException {
        // loginPage.getUserCredential("admin");
        System.out.println("Username is" + " " + credentials.getUsername());
        // loginPage.loginTOApplication(credentials.getUsername(), credentials.getPassword());
        SeleniumPageActionsHelper.validateElementPresent(webLocators.HOMEPAGE);
    }

    @Test
    @Order(2)
    public void ClickAdmin() {
        homePage.clickMenuItem(MenuType.ADMIN);
        SeleniumPageActionsHelper.validateElementPresent(webLocators.ADMINPAGE);
    }
}
