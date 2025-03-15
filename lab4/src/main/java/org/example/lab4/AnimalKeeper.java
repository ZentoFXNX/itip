package org.example.lab4;

public class AnimalKeeper {
    private Animal animal;

    // IoC
    public AnimalKeeper(Animal animal) {
        this.animal = animal;
    }

    public void printAnimalType() {
        System.out.println("Animal type: " + animal.getType());
    }
}