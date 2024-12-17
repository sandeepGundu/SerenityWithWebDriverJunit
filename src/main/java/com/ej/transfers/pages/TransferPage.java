package com.ej.transfers.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class TransferPage extends PageObject
{

    @FindBy(id = "transferPageButton")
    private WebElementFacade transferPageButton;

    @FindBy(id = "transferType")
    private WebElementFacade transferTypeDropdown;

    @FindBy(id = "amount")
    private WebElementFacade amountField;

    @FindBy(id = "recipientAccount")
    private WebElementFacade recipientAccountField;

    @FindBy(id = "submitTransferButton")
    private WebElementFacade submitTransferButton;

    @FindBy(id = "confirmTransferButton")
    private WebElementFacade confirmTransferButton;

    @FindBy(id = "transferStatus")
    private WebElementFacade transferStatus;

    public void openTransferPage() {
        transferPageButton.click();
    }

    public void chooseTransferType(String transferType) {
        transferTypeDropdown.selectByVisibleText(transferType);
    }

    public void enterAmount(double amount) {
        amountField.type(String.valueOf(amount));
    }

    public void enterRecipientAccount(String recipientAccount) {
        recipientAccountField.type(recipientAccount);
    }

    public void clickSubmitTransfer() {
        submitTransferButton.click();
    }

    public void confirmTransfer() {
        confirmTransferButton.click();
    }

    public String getTransferStatus() {
        return transferStatus.getText();
    }
}
