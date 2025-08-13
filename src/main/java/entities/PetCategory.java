package entities;

import lombok.Getter;

@Getter
public class PetCategory {
    int id;
    String name;

    public PetCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }
}