package org.example;

abstract class Weapon {
    protected String name;
    protected int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attack();
}