package org.example.model.monsters;

import org.example.model.characters.Hero;

public class GoblinSea extends Goblin {
    public GoblinSea(Hero hero) {
        super(
                30 * hero.getLevel(),
                30 * hero.getLevel(),
                "Vattengoblin",
                10 * hero.getLevel(),
                5 * hero.getLevel(),
                5  * hero.getLevel(),
                "Dolk",
                "Sjön");
    }
}
