package com.com.andersen.game.People;


import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.MagicDamage;
import com.com.andersen.game.Capabilities.MagicSupport;
import com.com.andersen.game.Race;

public class PeopleMagician extends All_capabilities implements MagicSupport, MagicDamage {

    public PeopleMagician (boolean isBuffed, Race race) {
        super(false, Race.people);
    }

    @Override
    public double magicDamageSkill(All_capabilities target) {
        return target.setHealth(target.getHealth() -4);
    }

    @Override
    public double magicSupportSkill(All_capabilities target) {
        return target.setHealth(target.getHealth() +10);
    }


}
