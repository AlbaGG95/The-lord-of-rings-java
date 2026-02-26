package org.example.model;

public class Orc extends Character {
    private int brutality;
    private String tribe;

    public Orc(String name, int age, String weapon, String region, int health, int brutality, String tribe) {
        super(name, age, weapon, region, health);
        this.brutality = brutality;
        this.tribe = tribe;
    }

    public int getBrutality() {
        return brutality;
    }

    public String getTribe() {
        return tribe;
    }

    public void setBrutality(int brutality) {
        this.brutality = brutality;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Brutality: " + brutality + " | Tribe: " + tribe;
    }
}
