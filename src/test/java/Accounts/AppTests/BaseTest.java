package Accounts.AppTests;

import Accounts.Steps.SearchTextSteps;
import Accounts.UIPages.NavigateActions;
import Accounts.UIPages.SearchActions;
import Accounts.UIPages.SearchResultSidebar;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @Managed(uniqueSession = true)
    WebDriver browser;

    @Steps
    NavigateActions navigateActions;

    @Steps
    SearchActions searchActions;

    @Steps
    SearchResultSidebar searchResultSidebar;

    @Steps
    SearchTextSteps searchTextSteps;

    public static String configPrivateKey() {
        String accessToken = System.getProperty("token");

        /*if (accessToken == null) {
            return config().getProperty("token");
        }*/
        return accessToken;
    }
}
