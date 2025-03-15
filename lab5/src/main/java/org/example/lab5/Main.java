package org.example.lab5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        boolean useJavaConfig = true;

        if (useJavaConfig) {
            // Java Configuration
            AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(SpringConfig.class);
            AnimalKeeper keeperJava = contextJava.getBean("animalKeeperBean", AnimalKeeper.class);
            keeperJava.printAnimalType();
            contextJava.close();
        } else {
            // XML Configuration
            ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
            AnimalKeeper keeperXml = contextXml.getBean("animalKeeperBean", AnimalKeeper.class);
            keeperXml.printAnimalType();
            contextXml.close();
        }
    }
}

