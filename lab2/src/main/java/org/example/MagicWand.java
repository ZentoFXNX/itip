package org.example;

class MagicWand extends Weapon {
    public MagicWand() {
        super("Волшебная палочка", 20);
    }

    @Override
    public void attack() {
        System.out.println(name + " выпускает магический снаряд! Урон: " + damage);
    }
}