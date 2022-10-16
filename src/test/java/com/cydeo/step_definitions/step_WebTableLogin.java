package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablesLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class step_WebTableLogin {
    WebTablesLoginPage webTablesCydeoPage = new WebTablesLoginPage();

    @Given("Open a chrome browser and Go to {string}")
    public void open_a_chrome_browser_and_go_to_https_web_table_cydeo_com_login(String string) {
        Driver.getDriver().get(string);
    }
    @When("Enter username {string}")
    public void enter_username(String string) {
        webTablesCydeoPage.usernameInputBox.sendKeys(string);
    }
    @When("Enter password: {string}")
    public void enter_password(String string) {
webTablesCydeoPage.passwordInputBox.sendKeys(string);
    }
    @Then("URL should end with {string}")
    public void url_should_end_with_orders(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(string));
    }

    @And("User Click login button")
    public void userClickLoginButton() {
        webTablesCydeoPage.loginBtn.click();
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
webTablesCydeoPage.usernameInputBox.sendKeys(credentials.get("username"));
webTablesCydeoPage.passwordInputBox.sendKeys(credentials.get("password"));
webTablesCydeoPage.loginBtn.click();
    }
}
