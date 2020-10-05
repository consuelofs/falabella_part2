package com.falabella.stepDefinitions;

import com.falabella.page.FalabellaHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FalabellaSteps {
    FalabellaHomePage falabellaHomePage;

    @When("user goes to falabella home page and search {string}")
    public void searchProduct(String product) {
        falabellaHomePage.getSearchInFalabella().sendKeys(product);
        falabellaHomePage.getSearchInFalabella().click();
    }

    @And("sees product detail")
    public void viewDetail() {
        falabellaHomePage.getDetails().click();
    }

    @And("adds product to back")
    public void addProductToBack() {
        falabellaHomePage.getAddProd().click();
    }

    @And("go to the shopping Bag")
    public void goesToBack() {
        falabellaHomePage.getViewBack().click();
    }

    @And("increase to 2 products to buy")
    public void increaseNumberOfProd(){
        if(falabellaHomePage.getTotalProdBack().equals(1)) {
            falabellaHomePage.getIncreaseNumberOfProducts().click();
        }
    }

    @And("chooses warranty option {string}")
    private void addWarranty(String option) {
        if(falabellaHomePage.getTextWarranty().isEnabled()){
            switch (option){
                case "No, gracias" :
                    falabellaHomePage.getNotAddWarranty().click();
                    break;
                case "Consolas 1 Año $ 31.990" :
                    falabellaHomePage.getAddWarrantyOneYear().click();
                    break;
                case "Consolas 2 Años $ 49.990" :
                    falabellaHomePage.getAddWarrantyTwoYear().click();
                    break;
                case "Consolas 3 Años $ 89.990" :
                    falabellaHomePage.getAddWarrantyThreeYear().click();
                    break;
                default:
                    break;
            }
        }
    }

    @Then("user goes to buy product")
    public void goToBuyProduct(){
        falabellaHomePage.getGoBuy().click();
    }

}
