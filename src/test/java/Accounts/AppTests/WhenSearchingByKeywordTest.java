package Accounts.AppTests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeywordTest extends BaseTest
{

    @Test
    public void theKeywordShouldAppearInTheResultsSidebar() throws InterruptedException {
        searchTextSteps.navigateToSearchPage();
        Thread.sleep(10000);
        searchTextSteps.typeSearchText();
        searchTextSteps.verifySearchText();
    }
}
