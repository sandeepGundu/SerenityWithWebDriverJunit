package Accounts.UIPages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject
{
    public void doLogin(){
        $("#email").sendKeys("janthird2021batch@gmail.com");
        $("#passwd").sendKeys("Selenium12345");
        $("#SubmitLogin").click();

    }

    public String accountPageIsVisible(){
        return $("div#center_column h1").getText();
    }

    public void goToContactsUsPage(){
        $(By.linkText("Contact us")).click();
    }
}
