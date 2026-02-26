package org.example.model;

public class Human extends Character {
    private String kingdom;
    private int leadership;

    public Human(String name, int age, String weapon, String region, int health, String kingdom, int leadership) {
        super(name, age, weapon, region, health);
        this.kingdom = kingdom;
        this.leadership = leadership;
    }

    public String getKingdom() {
        return kingdom;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Kingdom: " + kingdom + " | Leadership: " + leadership;
    }
}
