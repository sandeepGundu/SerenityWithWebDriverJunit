package Accounts.Steps;

import Accounts.UIPages.NavigateActions;
import Accounts.UIPages.SearchActions;
import Accounts.UIPages.SearchResultSidebar;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SearchTextSteps
{
    private NavigateActions navigateActions;
    private SearchActions searchActions;
    private SearchResultSidebar searchResultSidebar;

    @Step
    public void navigateToSearchPage()
    {
        navigateActions.toTheDuckDuckGoSearchPage();
    }

    @Step
    public void typeSearchText()
    {
        searchActions.byKeyword("Cucumber");
    }

    @Step
    public void verifySearchText()
    {
        //Assert.assertTrue(searchResultSidebar.heading().equals("Cucumber"));
        Serenity.reportThat("The keyword should appear in the sidebar heading",
                () -> assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber")
        );
    }

}
