package com.company;

public class Warrior extends BaseClass{
    private int shieldStrength;

    public Warrior(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, int attackCharacter, boolean arrested, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, running, attackCharacter, arrested);
        this.shieldStrength = shieldStrength;
        this.setAttackPower(10);
        this.setName("Warrior");
        this.setSpeed(50);
        this.setStamina(100);
        this.setStrength(100);
    }

    public Warrior(boolean running, boolean arrested, int health, int shieldStrength) {
        super(running, arrested, health);
        this.shieldStrength = shieldStrength;
        this.setRunning(false);
        this.setArrested(false);
        this.setHealth(100);
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
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
        System.out.println("checking strength levels for Warrior " + strength);
    }
}
