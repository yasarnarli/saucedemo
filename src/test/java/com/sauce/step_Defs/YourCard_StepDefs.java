package com.sauce.step_Defs;

import com.sauce.pages.YourCardPage;
import io.cucumber.java.en.When;

public class YourCard_StepDefs {
    YourCardPage yourCardPage=new YourCardPage();
    @When("The user should be able to open the basket")
    public void the_user_should_be_able_to_open_the_basket() {
        yourCardPage.openBasket_loc.click();
    }

    @When("The user should be able to checkout")
    public void theUserShouldBeAbleToCheckout() {
        yourCardPage.checkout_loc.click();
    }
}
