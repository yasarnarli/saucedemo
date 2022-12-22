package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productHeader_loc;

    @FindBy(css = "[class='product_sort_container']")
    public WebElement sortByPrice_loc;

    @FindBy (xpath = "//button[starts-with(@class,'btn')]")
    public List<WebElement> selectProduct_loc;



    public void sortByPrice_HighToLow_met(String string) {
        Select select = new Select(sortByPrice_loc);
        select.selectByVisibleText(string);



    }

    public void selectWithIndex(int index){
        selectProduct_loc.get(index).click();
    }





}
