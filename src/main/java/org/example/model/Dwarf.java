package org.example.model;

public class Dwarf extends Character {
    private double beardLength;
    private String axeType;

    public Dwarf(String name, int age, String weapon, String region, int health, double beardLength, String axeType) {
        super(name, age, weapon, region, health);
        this.beardLength = beardLength;
        this.axeType = axeType;
    }

    public double getBeardLength() {
        return beardLength;
    }

    public String getAxeType() {
        return axeType;
    }

    public void setBeardLength(double beardLength) {
        this.beardLength = beardLength;
    }

    public void setAxeType(String axeType) {
        this.axeType = axeType;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Beard Length: " + beardLength + " | Axe Type: " + axeType;
    }
}
