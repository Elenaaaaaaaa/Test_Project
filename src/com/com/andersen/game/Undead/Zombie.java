package com.com.andersen.game.Undead;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;

public class Zombie extends All_capabilities implements Melee {

    public Zombie(boolean isBuffed, Race race) {
        super(false, Race.undead);
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        return target.setHealth(target.getHealth()-18);
    }

}
