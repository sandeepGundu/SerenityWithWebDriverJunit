package com.ej.transfers.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends PageObject
{

    @FindBy(xpath = "//button[@name='logoutButton']")
    private WebElementFacade logoutButton;

    @FindBy(css = "div.logoutConfirmation")
    private WebElementFacade logoutConfirmation;

    @FindBy(css = "button.confirmLogout")
    private WebElementFacade confirmLogoutButton;

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void confirmLogout() {
        confirmLogoutButton.waitUntilVisible().click();
    }

    public boolean isLogoutConfirmed() {
        return logoutConfirmation.isVisible();
    }
}
