package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSourcePage;
import com.cydeo.pages.WikipediaHomePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_Step {
    WikipediaHomePage wikipediaHomePage= new WikipediaHomePage();
    WikiSourcePage wikiSourcePage= new WikiSourcePage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKey) {
        wikipediaHomePage.wikisearchBox.sendKeys(searchKey);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
    wikipediaHomePage.searchBtn.click();
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String searchKey) {
        Assert.assertTrue(wikiSourcePage.headerTitle.getText().equals(searchKey));
    }


    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String searchKey) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchKey));
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String searchKey) {
        Assert.assertTrue(wikiSourcePage.imageHeader.getText().equals(searchKey));
    }
}
