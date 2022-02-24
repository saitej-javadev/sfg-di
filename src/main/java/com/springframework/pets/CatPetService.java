package com.springframework.pets;

import org.springframework.stereotype.Service;


public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats are Best";
    }
}
