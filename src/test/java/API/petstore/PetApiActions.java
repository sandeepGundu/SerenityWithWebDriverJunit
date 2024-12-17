package API.petstore;

import net.serenitybdd.core.steps.UIInteractions;
import static net.serenitybdd.rest.SerenityRest.given;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.hamcrest.Matchers;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;

import static net.serenitybdd.rest.SerenityRest.*;

public class PetApiActions extends UIInteractions
{
    public Long givenKittyIsAvailableInPetStore()
    {
        Pet pet = new Pet("Kitty", "available");

        Long newId = given()
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/pet")
                .body(pet, ObjectMapperType.GSON)
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON).post().getBody().as(Pet.class, ObjectMapperType.GSON).getId();
        return newId;
    }

    public void whenIAskForAPetWithId(Long id)
    {
        when().get("/" + id);
    }

    public void thenISeeKittyAsResult()
    {
        then().body("name", Matchers.equalTo("Kitty"));
    }


}
