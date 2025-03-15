package org.example.lab5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example.lab5")
class SpringConfig {
    @Bean(name = "animalKeeperBean")
    public AnimalKeeper getAnimalKeeperBean(@Qualifier("parrotBean") Animal animal) {
        return new AnimalKeeper(animal);
    }
}
