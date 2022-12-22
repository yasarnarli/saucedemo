package com.sauce.step_Defs;

import com.sauce.pages.ProductPage;
import io.cucumber.java.en.When;

import java.util.List;

public class Purchase_StepDefs {

    ProductPage productPage=new ProductPage();
    @When("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String string) {
        productPage.sortByPrice_HighToLow_met(string);


    }


    @When("The user should be able to select products with index number {string}")
    public void theUserShouldBeAbleToSelectProductsWithIndexNumber(String index) {
        productPage.selectWithIndex(Integer.parseInt(index)-1);
    }
}
