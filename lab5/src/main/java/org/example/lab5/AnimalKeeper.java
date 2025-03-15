package org.example.lab5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class AnimalKeeper {
    private Animal animal;

    @Autowired
    public AnimalKeeper(@Qualifier("catBean") Animal animal) {
        this.animal = animal;
    }

    public void printAnimalType() {
        System.out.println("Animal type: " + animal.getType());
    }
}