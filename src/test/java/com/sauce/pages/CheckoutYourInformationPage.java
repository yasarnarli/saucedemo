package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage extends BasePage{
    @FindBy(id = "first-name" )
    public WebElement firstName_loc;

    @FindBy(id = "last-name")
    public WebElement lastName_loc;

    @FindBy(id = "postal-code")
    public WebElement postalCode_loc;

    @FindBy(id = "continue")
    public WebElement continue_loc;


    public void inputYourInformation(String firstname, String lastname, String postalcode){
        firstName_loc.sendKeys(firstname);
        lastName_loc.sendKeys(lastname);
        postalCode_loc.sendKeys(postalcode);
    }

    public void clickContinueButton(){
        continue_loc.click();
    }


}
