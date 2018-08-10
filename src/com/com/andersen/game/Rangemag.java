package com.com.andersen.game;

import com.com.andersen.game.Capabilities.MagicDamage;
import com.com.andersen.game.Capabilities.MagicSupport;

public abstract class Rangemag extends All_capabilities implements MagicDamage, MagicSupport {
    public RangeMag(boolean isBuffed, Race race) {
        super(isBuffed, race);
    }

    @Override
    public double magicDamageSkill(Character target) {
        return 0;
    }

    @Override
    public void damage() {

    }

    @Override
    public boolean magicSupportSkill(Character target) {
        return false;
    }


}
