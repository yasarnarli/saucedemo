package com.sauce.step_Defs;

import com.sauce.pages.CheckoutYourInformationPage;
import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class CheckoutYourInformation_StepDefs {

    CheckoutYourInformationPage checkoutYourInformationPage=new CheckoutYourInformationPage();
    @When("The user should enter first name {string} lastname {string} and postal code {string}")
    public void the_user_should_enter_first_name_lastname_and_postal_code(String firstName, String lastName, String postalCode) {


//        checkoutYourInformationPage.firstName_loc.sendKeys(firstName);
//        checkoutYourInformationPage.lastName_loc.sendKeys(lastName);
//        checkoutYourInformationPage.postalCode_loc.sendKeys(postalCode);
        checkoutYourInformationPage.inputYourInformation(firstName,lastName,postalCode);

    }

    @When("The user should be able to click continue button")
    public void theUserShouldBeAbleToClickContinueButton() {
checkoutYourInformationPage.clickContinueButton();
//        checkoutYourInformationPage.continue_loc.click();
    }
}
