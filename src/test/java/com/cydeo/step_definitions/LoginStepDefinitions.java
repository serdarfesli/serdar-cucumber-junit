package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @When("user enters librarian username")
    public void userEntersLibrarianUsername() {
        System.out.println("User enters librarian username");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }

    @When("User Click the login button")
    public void click_the_login_button() {
        System.out.println("User clicks login button");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters student password");
    }

    @When("user enters Admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username");
    }

    @And("user enters Admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters admin password");
    }


    @Given("coming from Background user is on the login page")
    public void comingFromBackgroundUserIsOnTheLoginPage() {
        System.out.println("coming from background");
    }
}


