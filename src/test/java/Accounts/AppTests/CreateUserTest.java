package Accounts.AppTests;

import Accounts.API.EndPoint.UserRequest;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.restassured.RestAssured;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(SerenityJUnit5Extension.class)
public class CreateUserTest
{
    //private EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    //private EnvironmentVariables environmentVariables = Injectors.getInjector().getInstance(EnvironmentVariables.class);

    private EnvironmentVariables environmentVariables = ThucydidesWebDriverSupport.getEnvironmentVariables();


    @Test
    public void shouldCreateNewUser() {

        String token = environmentVariables.getProperty("token");

        // Create user request data
        UserRequest userRequest = new UserRequest("John Doe", "male", "john.doe@example.com", "active");

        // Send the POST request
        RestAssured.given()
                .baseUri("https://gorest.co.in")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token) // Replace YOUR_ACCESS_TOKEN with your actual access token
                .body(userRequest)
                .post("/public/v2/users")
                .then()
                .statusCode(201);

        // Verify the response
        restAssuredThat(response -> response.body("data.name", equalTo("John Doe")));
    }
}
