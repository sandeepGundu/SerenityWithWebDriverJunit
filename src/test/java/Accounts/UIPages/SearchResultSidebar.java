package Accounts.UIPages;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultSidebar extends PageComponent
{
    @FindBy(xpath = "//h2[@class='Ee2e63EzQ9F3xq9wsGDY']")
    WebElement searchResultText;

    public String heading()
    {
        return searchResultText.getText();
    }
}
