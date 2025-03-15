package org.example.lab4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "animalBean")
    public Cat getBean() {
        return new Cat();
    }
}