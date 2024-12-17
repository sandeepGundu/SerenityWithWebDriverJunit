package Accounts.UIPages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
