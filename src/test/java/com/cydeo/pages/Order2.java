package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://web-table-2.cydeo.com/create-order
public class Order2 {
    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(css = "input[name='cardNo']")
    public WebElement cardnoInput;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardexpInput;

    @FindBy(css = "button[type='submit']")
    public WebElement processButton;

    // No page elements added

    public Order2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    
}