package com.ua.utils;

import com.ua.driver.Driver;
import com.ua.driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.runner.Description;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

public class SeleniumPageActionsHelper {

    private SeleniumPageActionsHelper(){}

    public static void clickElement(By by) {
        waitForElement(by);
        DriverManager.getDriver().findElement(by).click();
    }

    public static void sendKeys(By by, String value) {
        waitForElement(by);
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    public static boolean validateElementPresent(By locator) throws NoSuchElementException {
        try {
            waitForElement(locator);
            takeScreenshot();
            WebElement element = DriverManager.getDriver().findElement(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void waitForElement(By locator) {

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private static void takeScreenshot() {
        WebDriver driver = DriverManager.getDriver();
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destinationFile = new File("screenshots/web/" +  timestamp + ".png");

       // File destinationFile = new File("screenshots/webTest" + methodName + ".png");

        try {
            destinationFile.getParentFile().mkdirs();
            FileHandler.copy(screenshot, destinationFile);
            System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
