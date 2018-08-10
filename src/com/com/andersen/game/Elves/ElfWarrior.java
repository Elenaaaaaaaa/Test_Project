package com.com.andersen.game.Elves;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;

public class ElfWarrior extends All_capabilities implements Melee {

     public ElfWarrior (boolean isBuffed, Race race) {
         super(false, Race.elf);
     }


    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            setBuffed(false);
            return target.setHealth(target.getHealth() - 7.5);
        } else {
            return target.setHealth(target.getHealth() - 15);
        }
    }
}
