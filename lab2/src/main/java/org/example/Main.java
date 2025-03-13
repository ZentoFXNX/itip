package org.example;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Sword();
        Weapon bow = new Bow();
        Weapon wand = new MagicWand();

        sword.attack();
        bow.attack();
        wand.attack();
    }
}
