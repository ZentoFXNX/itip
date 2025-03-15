package org.example.lab4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

        Animal animal = context.getBean("animalBean", Animal.class);
        AnimalKeeper keeper = new AnimalKeeper(animal);
        keeper.printAnimalType();
        context.close();
    }
}