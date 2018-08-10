package com.com.andersen.game.Undead;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Capabilities.Shooting;
import com.com.andersen.game.Race;

public class Hunter extends All_capabilities implements Shooting, Melee {


    public Hunter(boolean isBuffed, Race race) {
        super(false, Race.undead);
    }

    @Override
    public double shootSkill(All_capabilities target) {
        return target.setHealth(target.getHealth() -4);
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        return target.setHealth(target.getHealth()-2);
    }



}
