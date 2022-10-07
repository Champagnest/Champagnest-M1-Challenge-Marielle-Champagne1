package com.company;

public class Farmer extends BaseClass{

    public Farmer() {
       boolean harvesting;
    }

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, int attackCharacter, boolean arrested) {
        super(name, strength, health, stamina, speed, attackPower, running, attackCharacter, arrested);
        this.setAttackPower(1);
        this.setName("Farmer");
        this.setSpeed(10);
        this.setStamina(75);
        this.setStrength(75);
    }

    public Farmer(boolean running, boolean arrested, int health) {
        super(running, arrested, health);
        this.setRunning(false);
        this.setArrested(false);
        this.setHealth(100);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
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



    public void stamina(){
        System.out.println("checking stamina levels " + stamina);

    }
    public void strength() {
        System.out.println("checking strength levels Farmer " + strength);
    }

}
