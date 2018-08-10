package com.com.andersen.game.People;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;

public class PeopleWarrior extends All_capabilities implements Melee {

    public PeopleWarriorWarrior (boolean isBuffed, Race race) {
        super(false, Race.people);
    }


    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            setBuffed(false);
            return target.setHealth(target.getHealth() - 9);
        } else {
            return target.setHealth(target.getHealth() - 18);
        }
    }
}
