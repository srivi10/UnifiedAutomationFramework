package com.ua.pages;

import com.ua.locators.WebLocators;
import com.ua.utils.SeleniumPageActionsHelper;
import com.ua.utils.WebJsonUtil;
import org.openqa.selenium.By;

import java.util.Map;

import static com.ua.utils.SeleniumPageActionsHelper.*;

public class LoginPage {
    private WebJsonUtil.CredentialSet credentialSet;
    private WebJsonUtil.Credentials credentials;
    WebLocators webLocators =new WebLocators();

    public LoginPage setUserNameTextBox(String userName) {
        sendKeys(webLocators.USERNAME_TEXT_BOX, userName);
        return this;
    }

    public LoginPage setPasswordTextBox(String password) {
        sendKeys(webLocators.PASSWORD_TEXT_BOX, password);
        return this;
    }

    public LoginPage setLoginButton() {
        clickElement(webLocators.LOGIN_BUTTON);
        return this;
    }

    public void loginTOApplication(String userName, String password) {
        setUserNameTextBox(userName).setPasswordTextBox(password).setLoginButton();

    }

    public void getUserCredential(String userType){
        WebJsonUtil webJsonUtil = new WebJsonUtil();
        credentialSet = webJsonUtil.readCredentialSet("webTestData.json");
// Select user type dynamically
       // String userType = "admin"; // or "manager" or "employee"
        Map<String, WebJsonUtil.Credentials> users = credentialSet.getUsers();
        credentials = users.get(userType);
    }
}
