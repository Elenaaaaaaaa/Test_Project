package com.com.andersen.game.People;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Capabilities.Shooting;
import com.com.andersen.game.Race;


public class Arbalester extends All_capabilities implements Shooting, Melee {

    public Arbalester (boolean isBuffed, Race race) {
        super(false, Race.people);
    }

    @Override
    public double shootSkill(All_capabilities target) {
        return target.setHealth(target.getHealth() -5);
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            setBuffed(false);
            return target.setHealth(target.getHealth() - 1.5);
        } else {
            return target.setHealth(target.getHealth() - 3);
        }
    }
}
