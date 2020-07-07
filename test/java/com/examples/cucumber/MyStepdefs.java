package com.examples.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {
    @Given("I have <opening balance> beer cans")
    public void iHaveOpeningBalanceBeerCans(String multilineText) {
        System.out.println(multilineText);
    }

    @And("I have drunk <processed> beer cans")
    public void iHaveDrunkProcessedBeerCans() {
    }

    @When("I go to my fridge")
    public void iGoToMyFridge() {
    }

    @Then("I should have <in stock> beer cans")
    public void iShouldHaveInStockBeerCans() {
    }
}
