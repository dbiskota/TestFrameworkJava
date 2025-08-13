package api;

import api.steps.PetSteps;
import entities.Pet;
import entities.PetCategory;
import entities.PetTags;
import net.datafaker.Faker;
import org.testng.annotations.*;
import utils.BaseTest;
import utils.enums.PetStatus;

import static properties.TestData.POST_PET_JSON;
import static utils.asserts.AssertsUtil.assertCodeAndJson;

public class PetResourceTests extends BaseTest {

    private final PetSteps petSteps = new PetSteps();

    @DataProvider(name = "pets")
    public Object[][] petsList() {
        Faker faker = new Faker();

        PetCategory petCategory = new PetCategory(faker.number().randomDigit(), faker.beer().name());
        PetTags petTags = new PetTags(faker.number().randomDigit(), faker.name().lastName());

        Pet petA = new Pet(faker.number().randomDigit(), petCategory, faker.name().firstName(), faker.image().base64GIF(), petTags, PetStatus.available);
        return new Object[][]{{petA}};
    }

    @Test(dataProvider = "pets", groups = "pet")
    public void checkAddAPet(Pet pet) {
        assertCodeAndJson(petSteps.createPet(pet), POST_PET_JSON, 200);
    }
}
