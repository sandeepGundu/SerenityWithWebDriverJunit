package Accounts.UIPages;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions
{
    public void toTheDuckDuckGoSearchPage() {
        openUrl("https://duckduckgo.com/");
    }
}
