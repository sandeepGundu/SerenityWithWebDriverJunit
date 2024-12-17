package com.ej.transfers.steps;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SearchTextSteps extends BaseSteps
{
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
