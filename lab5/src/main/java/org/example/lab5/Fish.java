package org.example.lab5;

import org.springframework.stereotype.Component;

@Component("fishBean")
class Fish implements Animal {
    @Override
    public String getType() {
        return "Fish";
    }
}