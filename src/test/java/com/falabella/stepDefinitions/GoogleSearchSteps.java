package com.falabella.stepDefinitions;

import com.falabella.page.GoogleHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class GoogleSearchSteps {
    GoogleHomePage googleHomePage;
    @Given("user navigates to GOOGLE and search {string}")
    public void searchFalabellaHomePageFromGoogle(String textToSearch) {
        if (googleHomePage.getSearchBoxInpt().isEnabled()){
            googleHomePage.getSearchBoxInpt().sendKeys(textToSearch);
            googleHomePage.getSearchBtn().click();
        }
    }
    @And("user goes to first result")
    public void goToFirstResult(){
        googleHomePage.getFirstResult().click();
    }
}
