package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCardPage extends BasePage{
    @FindBy(css = ".shopping_cart_link")
    public WebElement openBasket_loc;

    @FindBy(id = "checkout")
    public WebElement checkout_loc;
}
