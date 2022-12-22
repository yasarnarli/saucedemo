package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{
    @FindBy(xpath = "//div[@class='complete-text']")
    public WebElement completedeOrderMessage_loc;
}
