package com.ej.transfers.steps;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;


public class LogoutSteps extends BaseSteps
{

    @Step
    public void LogoutFromApplication() {
        userClicksOnTheLogoutButton();
        userConfirmsTheLogout();
        userShouldBeSuccessfullyLoggedOut();
    }

    public void userClicksOnTheLogoutButton() {
        logoutPage.clickLogoutButton();
    }

    public void userConfirmsTheLogout() {
        logoutPage.confirmLogout();
    }

    public void userShouldBeSuccessfullyLoggedOut() {
        Assert.assertTrue("User should see the logout confirmation message", logoutPage.isLogoutConfirmed());
    }
}
