package com.company;

public class Constable extends BaseClass{

    private boolean jurisdiction = false;


    public Constable(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, int attackCharacter, boolean arrested, boolean jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, attackCharacter, arrested);
        this.jurisdiction = jurisdiction;
        this.setAttackPower(5);
        this.setName("Constable");
        this.setSpeed(20);
        this.setStamina(60);
        this.setStrength(60);
    }

    public Constable(boolean running, boolean arrested, int health, boolean jurisdiction) {
        super(running, arrested, health);
        this.jurisdiction = jurisdiction;
        this.setRunning(false);
        this.setArrested(false);
        this.setHealth(100);
    }

    public boolean isJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction=" + jurisdiction +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", AttackCharacter=" + AttackCharacter +
                ", arrested=" + arrested +
                '}';
    }
    public void strength() {
        System.out.println("checking strength levels for Constable " + strength);
    }
}

