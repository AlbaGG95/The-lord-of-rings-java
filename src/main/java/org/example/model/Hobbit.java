package org.example.model;

public class Hobbit extends Character {
    private int stealth;
    private boolean lovesFood;

    public Hobbit(String name, int age, String weapon, String region, int health, int stealth, boolean lovesFood) {
        super(name, age, weapon, region, health);
        this.stealth = stealth;
        this.lovesFood = lovesFood;
    }

    public int getStealth() {
        return stealth;
    }

    public boolean isLovesFood() {
        return lovesFood;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public void setLovesFood(boolean lovesFood) {
        this.lovesFood = lovesFood;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Stealth: " + stealth + " | Loves Food: " + lovesFood;
    }
}
