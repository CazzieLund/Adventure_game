package org.example.model.monsters;

import org.example.model.characters.Hero;

public class GoblinForest extends Goblin {

    public GoblinForest(Hero hero) {
        super(
                30 * hero.getLevel(),
                30 * hero.getLevel(),
                "Skogsgoblin",
                10 * hero.getLevel(),
                5 * hero.getLevel(),
                5  * hero.getLevel(),
                "Pilbåge",
                "Skogen");
    }

}
