package org.example.lab3;

import org.springframework.stereotype.Component;

@Component
public class Fish extends Animal {
    @Override
    public String makeSound() {
        return "Blub blub...";
    }
}