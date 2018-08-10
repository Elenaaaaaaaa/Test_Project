package com.com.andersen.game;

public abstract class All_capabilities {
    private double health = 100;
    private boolean isBuffed;
    private Race race;


    public All_capabilities (boolean isBuffed, Race race) {
    this.isBuffed = isBuffed;
    this.race = race;
}

    public double getHealth() {
        return health;
    }

    public double setHealth(double health) {
        this.health = health;
    }

    public boolean isBuffed() {
        return isBuffed;
    }

    public double setBuffed(boolean buffed) {
        isBuffed = buffed;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
