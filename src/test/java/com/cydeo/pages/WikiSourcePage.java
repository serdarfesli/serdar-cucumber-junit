package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSourcePage {
    public WikiSourcePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "firstHeading")
    public WebElement headerTitle;

    @FindBy(xpath = "//table[@class='infobox biography vcard']//th/div")
    public WebElement imageHeader;
}
