package org.example;

class Bow extends Weapon {
    public Bow() {
        super("Лук", 10);
    }

    @Override
    public void attack() {
        System.out.println(name + " выпускает стрелу! Урон: " + damage);
    }
}