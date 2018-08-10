package com.com.andersen.game.Elves;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Capabilities.Shooting;
import com.com.andersen.game.Race;

public class ElfArcher extends All_capabilities implements Shooting, Melee {

    public ElfArcher(boolean isBuffed, Race race) {
        super(false, Race.elf);
    }

    @Override
    public double shootSkill(All_capabilities target) {
        return target.setHealth(target.getHealth() -7);
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            setBuffed(false);
            return target.setHealth(target.getHealth()-1.5);
        } else {
            return target.setHealth(target.getHealth()-3);
        }
    }

}
