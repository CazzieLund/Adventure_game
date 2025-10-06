package org.example.model.bosses;

import org.example.model.characters.Hero;

public class BossDragon extends Boss {
    public BossDragon(Hero hero) {
        super(
                30 + 5 * hero.getLevel(),
                30 + 5 * hero.getLevel(),
                "Boss Drake",
                20+ 5 * hero.getLevel(),
                10 + 5 * hero.getLevel(),
                6 + 4 * hero.getLevel(),
                "Bergen"
        );
    }
}
