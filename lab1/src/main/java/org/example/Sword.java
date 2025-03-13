package org.example;

class Sword extends Weapon {
    public Sword() {
        super("Меч", 15);
    }

    @Override
    public void attack() {
        System.out.println(name + " наносит рубящий удар! Урон: " + damage);
    }
}