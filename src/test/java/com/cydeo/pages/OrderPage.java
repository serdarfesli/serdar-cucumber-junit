package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage{
    public OrderPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy (xpath = "//select[@name='product']")
 public WebElement productTypeDropdown;

    @FindBy (xpath = "//input[@name='quantity']")
 public WebElement quantity;

    @FindBy (xpath = "//input[@name='name']")
 public WebElement customerName;

    @FindBy (xpath = "//input[@name='street']")
 public WebElement street;

    @FindBy (xpath = "//input[@name='city']")
 public WebElement city;

    @FindBy (xpath = "//input[@name='state']")
 public WebElement state;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zip;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> allRadioButtons;

    @FindBy (xpath = "//input[@value='Visa']")
    public WebElement visaRadioBtn;

    @FindBy (xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioBtn;

    @FindBy (xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioBtn;

    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement cCardNumber;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement expiryDate;

    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrderBtn;


}
