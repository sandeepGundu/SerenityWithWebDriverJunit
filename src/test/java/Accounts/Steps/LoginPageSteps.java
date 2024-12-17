package Accounts.Steps;

import Accounts.UIPages.LoginPage;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps
{
    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertTrue(loginPage.accountPageIsVisible().equals("MY ACCOUNT"));
    }

    @Step
    public void navigateToContactsUsPage(){
        loginPage.goToContactsUsPage();
    }
}
