package transfers;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class FundTransferTest extends BaseTest
{
    @Test
    public void fundTransfer_IntraBank()
    {
        loginSteps.userIsLoggedIntoTheBankingApplication();
        bankTransferSteps.selectTransferType("Intra-Bank");
        bankTransferSteps.enterTransferDetailsAndSubmit(10000, "12345678");
        bankTransferSteps.submitTransfer();
        bankTransferSteps.theTransferShouldBe("Success");
        logoutSteps.LogoutFromApplication();
    }

    @Test
    public void failure_fundTransfer_InterBank()
    {
        loginSteps.userIsLoggedIntoTheBankingApplication();
        bankTransferSteps.selectTransferType("Inter-Bank");
        bankTransferSteps.enterTransferDetailsAndSubmit(1000, "1234567890");
        bankTransferSteps.submitTransfer();
        bankTransferSteps.userShouldSeeAnErrorMessage("Insufficient Funds...");
        logoutSteps.LogoutFromApplication();
    }
}
