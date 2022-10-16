package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesLoginPage {
    public WebTablesLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    public  void login(){
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        usernameInputBox.sendKeys("Test");
        passwordInputBox.sendKeys("Tester");
        loginBtn.click();

    }

}
