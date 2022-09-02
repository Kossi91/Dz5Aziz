package com.company;

public class Main {

    static Hero[] hero;


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossProtectionType("Ne poluchaet uron ot random heroy");
        System.out.println(boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossProtectionType());
        createHeroes();
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].getHealth() + " " + hero[i].getDamage() + " " + hero[i].getSuperPower());

        }

    }
    public static Hero[] createHeroes() {
        Hero thor = new Hero(30, 250);
        Hero hulk = new Hero(300, 20, "Blok urona");
        Hero ironMan = new Hero(200, 25, "Lazer");
        hero = new Hero[]{ thor, hulk, ironMan};
        return hero;
    }
}


