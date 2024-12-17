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
        bankTransferSteps.login();
        bankTransferSteps.selectTransferType("Intra-Bank");
        bankTransferSteps.enterTransferDetailsAndSubmit(10000, "12345678");
        bankTransferSteps.submitTransfer();
    }

}
