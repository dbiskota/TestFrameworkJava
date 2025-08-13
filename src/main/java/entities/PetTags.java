package entities;

import lombok.Getter;

@Getter
public class PetTags {

    int id;
    String name;

    public PetTags(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
