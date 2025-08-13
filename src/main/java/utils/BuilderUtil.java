package utils;

import api.builders.*;
import entities.*;

import java.util.List;

public class BuilderUtil {
    public static PetProfileBuilder buildPetProfile(Pet pet){
//    int id, PetCategory category, String name, ArrayList<String> photoUrls, ArrayList<PetTagsBuilder> tags, PetStatus status) {
        return PetProfileBuilder.builder()
                .id(pet.getId())
                .category(buildPetCategory(pet.getCategory()))
                .name(pet.getName())
                .photoUrls(List.of(pet.getPhotoUrls()))
                .tags(List.of(buildPetTags(pet.getTags())))
                .status(pet.getStatus())
                .build();
    }

    public static PetCategoryBuilder buildPetCategory(PetCategory category) {
                return PetCategoryBuilder.builder()
                        .id(category.getId())
                        .name(category.getName())
                        .build();
    }

    public static PetTagsBuilder buildPetTags(PetTags tags) {
        return PetTagsBuilder.builder()
                .id(tags.getId())
                .name(tags.getName())
                .build();
    }
}
