package org.example.model.bosses;

import org.example.model.characters.Hero;

public class BossTree extends Boss {
    public BossTree(Hero hero) {
        super(
                30 * hero.getLevel(),
                30 * hero.getLevel(),
                "Boss Gammelträdet",
                10 * hero.getLevel(),
                5 * hero.getLevel(),
                5  * hero.getLevel(),
                "Skogen"
        );
    }
}
