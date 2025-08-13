package api.steps;

import api.builders.PetProfileBuilder;
import entities.Pet;
import io.restassured.response.Response;
import utils.BuilderUtil;

import static api.endpoints.PetEndpoints.PET_ADD;
import static utils.ApiServices.postRequest;

public class PetSteps {
    public Response createPet(Pet pet) {
        PetProfileBuilder petProfile = BuilderUtil.buildPetProfile(pet);
        return postRequest(PET_ADD, null, petProfile, null, null);
    }
}
