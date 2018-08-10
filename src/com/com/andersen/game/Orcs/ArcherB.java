package com.com.andersen.game.Orcs;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Capabilities.Shooting;
import com.com.andersen.game.Race;

public class ArcherB extends All_capabilities implements Shooting, Melee {

    public ArcherB (boolean isBuffed, Race race) {
        super(false, Race.orcs);
    }


    @Override
    public double meleeSkill(All_capabilities target) {
        return target.setHealth(target.getHealth()-2);
    }


    @Override
    public double shootSkill(All_capabilities target) {
        return target.setHealth(target.getHealth()-3);
    }
}
