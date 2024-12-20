package transfers;

import com.ej.transfers.steps.BankTransferSteps;
import com.ej.transfers.steps.LoginSteps;
import com.ej.transfers.steps.LogoutSteps;
import com.ej.transfers.steps.SearchTextSteps;
import com.ej.transfers.pages.NavigateActions;
import com.ej.transfers.pages.SearchActions;
import com.ej.transfers.pages.SearchResultSidebar;
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

    @Steps
    BankTransferSteps bankTransferSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    LogoutSteps logoutSteps;

}
