package entities;

import lombok.Getter;
import utils.enums.PetStatus;

@Getter
public class Pet {
    int id;
    PetCategory category;
    String name;
    String photoUrls;
    PetTags tags;
    PetStatus status;

    public Pet(int id, PetCategory category, String name, String photoUrls, PetTags tags, PetStatus status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }
}
