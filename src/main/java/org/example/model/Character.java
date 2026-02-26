package org.example.model;

public class Character {
    private String name;
    private int age;
    private String weapon;
    private String region;
    private int health;

    public Character(String name, int age, String weapon, String region, int health) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.region = region;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getRegion() {
        return region;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDetails() {
        return "Name: " + name + " | Age: " + age + " | Weapon: " + weapon + " | Region: " + region + " | Health: " + health;
    }
}
