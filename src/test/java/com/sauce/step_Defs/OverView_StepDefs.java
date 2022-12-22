package com.sauce.step_Defs;

import com.sauce.pages.OverviewPage;
import io.cucumber.java.en.When;

public class OverView_StepDefs {
    OverviewPage overviewPage=new OverviewPage();
    @When("The user should be able to finish the purchase")
    public void the_user_should_be_able_to_finish_the_purchase() {
    overviewPage.clickFinishButtonMtd();
    }
}
