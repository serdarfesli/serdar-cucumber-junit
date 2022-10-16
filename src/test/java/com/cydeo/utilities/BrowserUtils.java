package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {
    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle) {
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    public static void verifyTitle( String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void verifyURLContains(String expectedURLContains){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURLContains));
    }

    public static List<String> dropdownOptionsAsListOfString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);
        List<WebElement> optionsAsWebElement = select.getOptions();
        List<String> optionsAsString = new ArrayList<>();
        for (WebElement eachoption : optionsAsWebElement) {
            optionsAsString.add(eachoption.getText());
        }
        return optionsAsString;
    }
}
