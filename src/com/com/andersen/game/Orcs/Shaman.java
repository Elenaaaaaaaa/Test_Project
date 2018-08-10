package com.com.andersen.game.Orcs;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.MagicDamage;
import com.com.andersen.game.Capabilities.MagicSupport;
import com.com.andersen.game.Race;

public class Shaman extends All_capabilities implements MagicSupport, MagicDamage {

    public Shaman (boolean isBuffed, Race race) {
        super(false, Race.orcs);
    }

    @Override
    public double magicDamageSkill(All_capabilities target) {
        return target.setHealth(target.getHealth()+10);
    }

    @Override
    public double magicSupportSkill(All_capabilities target) {
        return target.setHealth(target.getHealth()-10);
    }
}
