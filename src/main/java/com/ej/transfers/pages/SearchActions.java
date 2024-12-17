package com.ej.transfers.pages;

import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions
{
    //@FindBy(xpath="//input[@id='searchbox_input']")
    //WebElement searchTextField;

    //By searchTextField = (By) By.xpath("//input[@id='searchbox_input']");

    public void byKeyword(String keyword)
    {

        $("//input[@id='searchbox_input']").sendKeys(keyword, Keys.ENTER);
    }
}
