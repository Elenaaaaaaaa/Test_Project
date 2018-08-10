package com.com.andersen.game.Undead;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Ailment;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;

public class Necromancer extends All_capabilities implements Melee, Ailment {

    public Necromancer(boolean isBuffed, Race race) {
        super(false, Race.undead);
    }

        @Override
        public double SendAilment (All_capabilities target){
            if (isBuffed()) {
                return target.setHealth(target.getHealth() - 5);
            } else {
                return target.setHealth(target.getHealth() - 10);
            }
        }

        @Override
        public double meleeSkill (All_capabilities target){
            return target.setHealth(target.getHealth() - 5);
        }

}

