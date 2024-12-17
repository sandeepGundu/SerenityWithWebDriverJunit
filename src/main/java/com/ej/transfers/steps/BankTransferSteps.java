package com.ej.transfers.steps;


import com.ej.transfers.pages.LoginPage;
import com.ej.transfers.pages.TransferPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BankTransferSteps extends BaseSteps
{

    @Step
    public void login() {
        loginPage.open();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("testpass");
        loginPage.clickLoginButton();
    }

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
        String status = transferPage.getTransferStatus();
        Assert.assertEquals("Transfer should be successful", "successful", status);
    }
}
