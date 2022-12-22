package com.sauce.step_Defs;

import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage=new LoginPage();
    ProductPage productPage=new ProductPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
loginPage.login_mtd(username,password);
        }
    @Then("The user should be able to login and see {string} page")
    public void the_user_should_be_able_to_login_and_see_page(String expectedHeader) {
        Assert.assertEquals(expectedHeader,productPage.productHeader_loc.getText());


        }

}
