package org.example.model.monsters;

import org.example.model.characters.Hero;

public class GoblinSea extends Goblin {
    public GoblinSea(Hero hero) {
        super(
                20 + 5 * hero.getLevel(),
                20 + 5 * hero.getLevel(),
                "Vattengoblin",
                5 + 5 * hero.getLevel(),
                5 + 2 * hero.getLevel(),
                3 + 2  * hero.getLevel(),
                "Dolk",
                "Sjön");
    }
}
