package org.example.model;

public class Elf extends Character {
    private int bowSkill;
    private boolean immortal;

    public Elf(String name, int age, String weapon, String region, int health, int bowSkill, boolean immortal) {
        super(name, age, weapon, region, health);
        this.bowSkill = bowSkill;
        this.immortal = immortal;
    }

    public int getBowSkill() {
        return bowSkill;
    }

    public boolean isImmortal() {
        return immortal;
    }

    public void setBowSkill(int bowSkill) {
        this.bowSkill = bowSkill;
    }

    public void setImmortal(boolean immortal) {
        this.immortal = immortal;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Bow Skill: " + bowSkill + " | Immortal: " + immortal;
    }
}
