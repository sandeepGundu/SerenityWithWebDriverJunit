package com.ej.transfers.steps;

import net.serenitybdd.annotations.Step;

public class LoginSteps extends BaseSteps
{
    @Step
    public void userIsLoggedIntoTheBankingApplication() {
        loginPage.open();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("testpass");
        loginPage.clickLoginButton();
    }
}
