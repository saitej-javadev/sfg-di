package com.springframework.pets;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are Best...";
    }
}
