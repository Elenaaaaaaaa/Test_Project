package com.com.andersen.game.Orcs;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;

public class Goblin extends All_capabilities implements Melee {

    public Goblin (boolean isBuffed, Race race) {
        super(false, Race.orcs);
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        return target.setHealth(target.getHealth()-20);
    }

}
