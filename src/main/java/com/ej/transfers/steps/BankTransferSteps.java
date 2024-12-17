package com.ej.transfers.steps;


import com.ej.transfers.pages.LoginPage;
import com.ej.transfers.pages.TransferPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BankTransferSteps extends BaseSteps
{

    @Step//("User logs into the banking application")
    public void login() {
        loginPage.open(); // Assuming there's a method to open the login page
        loginPage.enterUsername("testuser"); // Placeholder username
        loginPage.enterPassword("testpass"); // Placeholder password
        loginPage.clickLoginButton(); // Method to click the login button
    }

    @Step//("User selects transfer type {0}")
    public void selectTransferType(String transferType) {
        transferPage.openTransferPage(); // Navigate to the transfer page
        transferPage.chooseTransferType(transferType); // Method to select the transfer type
    }

    @Step//("User enters transfer details and submits")
    public void enterTransferDetailsAndSubmit(double amount, String recipientAccount) {
        transferPage.enterAmount(amount); // Method to enter the amount
        transferPage.enterRecipientAccount(recipientAccount); // Method to enter the recipient's account number
        transferPage.clickSubmitTransfer(); // Method to submit the transfer
    }

    @Step//("Submit the transfer")
    public void submitTransfer() {
        transferPage.confirmTransfer(); // Assuming there's a confirmation step
        String status = transferPage.getTransferStatus(); // Get the status of the transfer
        Assert.assertEquals("Transfer should be successful", "successful", status);
    }
}
