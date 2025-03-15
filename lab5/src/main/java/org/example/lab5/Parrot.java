package org.example.lab5;
import org.springframework.stereotype.Component;

@Component("parrotBean")
public class Parrot implements Animal {
    @Override
    public String getType() {
        return "Parrot";
    }
}