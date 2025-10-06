package org.example.model.bosses;

import org.example.model.characters.Hero;

public class BossSeaMonster extends Boss {
    public BossSeaMonster(Hero hero) {
        super(
                30 + 5 * hero.getLevel(),
                30 + 5 * hero.getLevel(),
                "Boss Sjöodjur",
                20+ 5 * hero.getLevel(),
                10 + 5 * hero.getLevel(),
                6 + 4 * hero.getLevel(),
                "Sjön"
        );
    }
}
