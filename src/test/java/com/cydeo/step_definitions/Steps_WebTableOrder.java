package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.pages.WebTablesLoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Steps_WebTableOrder {

    WebTablesLoginPage webTablesLoginPage = new WebTablesLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();
    ViewAllOrderPage viewAllOrderPage = new ViewAllOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        webTablesLoginPage.login();
        basePage.Order.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        Select select = new Select(orderPage.productTypeDropdown);
        select.selectByVisibleText(productType);
    }

    @When("user enters quantity {string}")
    public void user_enters_quantity(String quantity) {
        orderPage.quantity.sendKeys(quantity);
    }

    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String customerName) {
        orderPage.customerName.sendKeys(customerName);
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        orderPage.street.sendKeys(street);
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        orderPage.city.sendKeys(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
    orderPage.state.sendKeys(state);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zip) {
        orderPage.zip.sendKeys(zip);
    }

    @When("user enters credit card type {string}")
    public void user_enters_credit_card_type(String creditCardType) {
        List<WebElement> allRadioButtons = orderPage.allRadioButtons;
        for (WebElement eachRadioButton : allRadioButtons) {
            if (eachRadioButton.getAttribute("value").equalsIgnoreCase(creditCardType)){
                eachRadioButton.click();
            }
        }

    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String creditCardNumber) {
orderPage.cCardNumber.sendKeys(creditCardNumber);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expiryDate) {
orderPage.expiryDate.sendKeys(expiryDate);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
orderPage.processOrderBtn.click();
BrowserUtils.sleep(5);
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        Assert.assertTrue(viewAllOrderPage.firstRowNameColumn.getText().equals(string));
    }
}
