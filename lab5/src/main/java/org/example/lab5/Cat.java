package org.example.lab5;

import org.springframework.stereotype.Component;

@Component("catBean")
class Cat implements Animal {
    @Override
    public String getType() {
        return "Cat";
    }
}
