package com.company;

import java.util.Objects;

// used class code and office hour code for examples

public  abstract class BaseClass {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;
    protected boolean running;
    protected int AttackCharacter;
    protected boolean arrested;

    public BaseClass() {
        arrested = false;
        running = false;
        health = 100;
    }

    public BaseClass(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, int attackCharacter, boolean arrested) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = running;
        AttackCharacter = attackCharacter;
        this.arrested = arrested;
    }

    public BaseClass(boolean running, boolean arrested, int health) {
        this.running = running;
        this.arrested = arrested;
        this.health = 100;
        arrested = false;
        running = false;
        health = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getAttackCharacter() {
        return AttackCharacter;
    }

    public void setAttackCharacter(int attackCharacter) {
        AttackCharacter = attackCharacter;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseClass baseClass = (BaseClass) o;
        return strength == baseClass.strength && health == baseClass.health && stamina == baseClass.stamina && speed == baseClass.speed && attackPower == baseClass.attackPower && running == baseClass.running && AttackCharacter == baseClass.AttackCharacter && arrested == baseClass.arrested && Objects.equals(name, baseClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower, running, AttackCharacter, arrested);
    }

    @Override
    public String toString() {
        return "BaseClass{" +
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
}