package com.ua.utils;

import com.ua.driver.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

public class AppiumActionsHelper {

    public static void validateElementPresent(By by) throws NoSuchElementException {
        try {
            waitForElement(by);
            takeScreenshot();
            WebElement element = DriverManager.getDriver().findElement(by);
            Assert.assertTrue("Element is Found: " + by.toString(), element.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + by.toString());
        }
    }

    public static void waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private static void takeScreenshot() {
        WebDriver driver = DriverManager.getDriver();
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destinationFile = new File("screenshots/web/" + timestamp + ".png");

        // File destinationFile = new File("screenshots/webTest" + methodName + ".png");

        try {
            destinationFile.getParentFile().mkdirs();
            FileHandler.copy(screenshot, destinationFile);
            System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clickElement(By by) {
        waitForElement(by);
        DriverManager.getDriver().findElement(by).click();
    }
}