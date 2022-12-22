package com.sauce.step_Defs;

import com.sauce.pages.CheckoutCompletePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutComplete_StepDefs {
    CheckoutCompletePage checkoutCompletePage=new CheckoutCompletePage();

    @Then("Verify that your order were completed with message {string}")
    public void verify_that_your_order_were_completed_with_message(String expectedMessage) {
     String actualMessage=checkoutCompletePage.completedeOrderMessage_loc.getText();

        Assert.assertEquals("message couldn't be verified",expectedMessage,actualMessage);
    }
}
