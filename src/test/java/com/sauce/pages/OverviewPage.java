package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{
    @FindBy(id = "finish")
    public WebElement finish_loc;

    public void clickFinishButtonMtd(){
        finish_loc.click();
    }
}
