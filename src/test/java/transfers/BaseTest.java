package transfers;

import com.ej.transfers.steps.BankTransferSteps;
import com.ej.transfers.steps.LoginSteps;
import com.ej.transfers.steps.LogoutSteps;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @Managed(uniqueSession = true)
    WebDriver browser;

    @Steps
    BankTransferSteps bankTransferSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    LogoutSteps logoutSteps;

}
