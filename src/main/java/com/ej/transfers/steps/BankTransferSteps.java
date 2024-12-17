package com.ej.transfers.steps;


import com.ej.transfers.pages.LoginPage;
import com.ej.transfers.pages.TransferPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BankTransferSteps extends BaseSteps
{

    /*@Step
    public void userIsLoggedIntoTheBankingApplication() {
        loginPage.open();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("testpass");
        loginPage.clickLoginButton();
    }*/

    @Step
    public void selectTransferType(String transferType) {
        transferPage.openTransferPage();
        transferPage.chooseTransferType(transferType);
    }

    @Step
    public void enterTransferDetailsAndSubmit(double amount, String recipientAccount) {
        transferPage.enterAmount(amount);
        transferPage.enterRecipientAccount(recipientAccount);
        transferPage.clickSubmitTransfer();
    }

    @Step
    public void submitTransfer() {
        transferPage.confirmTransfer();
        //String status = transferPage.getTransferStatus();
        //Assert.assertEquals("Transfer should be successful", "successful", status);
    }

    @Step
    public void userEntersTransferDetailsWithInsufficientFunds(double amount, String recipientAccount) {
        transferPage.enterAmount(10000); // Assuming 10,000 is more than the user's balance
        transferPage.enterRecipientAccount("1234567890");
    }

    @Step
    public void theTransferShouldBe(String expectedResult) {
        String actualResult = transferPage.getTransferStatus();
        Assert.assertEquals("Expected transfer status to match", expectedResult, actualResult);
    }

    @Step
    public void userShouldSeeAnErrorMessage(String errorMessage) {
        String actualErrorMessage = transferPage.getErrorMessage();
        Assert.assertTrue("Error message should contain expected text", actualErrorMessage.contains(errorMessage));
    }


}
