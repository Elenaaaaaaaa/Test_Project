package com.com.andersen.game.Elves;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.MagicDamage;
import com.com.andersen.game.Capabilities.MagicSupport;
import com.com.andersen.game.Race;

public class ElfMagician extends All_capabilities implements MagicSupport, MagicDamage {
    @Override
    public double magicDamageSkill(All_capabilities target) {
        return target.setHealth(target.getHealth() -10);
    }

    @Override
    public double magicSupportSkill(All_capabilities target) {
        return target.setHealth(target.getHealth() +10);
    }

    public ElfMagician(boolean isBuffed, Race race) {
        super(false, Race.elf);
    }
}
