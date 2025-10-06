package org.example.model.bosses;

import org.example.model.characters.Hero;

public class BossTree extends Boss {
    public BossTree(Hero hero) {
        super(
                30 + 5 * hero.getLevel(),
                30 + 5 * hero.getLevel(),
                "Boss Gammelträdet",
                20+ 5 * hero.getLevel(),
                10 + 5 * hero.getLevel(),
                6 + 4 * hero.getLevel(),
                "Skogen"
        );
    }
}
