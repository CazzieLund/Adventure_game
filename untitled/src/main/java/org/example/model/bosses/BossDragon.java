package org.example.model.bosses;

import org.example.model.characters.Hero;

public class BossDragon extends Boss {
    public BossDragon(Hero hero) {
        super(
                30 * hero.getLevel(),
                30 * hero.getLevel(),
                "Boss Drake",
                10 * hero.getLevel(),
                5 * hero.getLevel(),
                5  * hero.getLevel(),
                "Bergen"
        );
    }
}
