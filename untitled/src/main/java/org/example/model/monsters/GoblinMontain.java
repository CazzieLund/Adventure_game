package org.example.model.monsters;

import org.example.model.characters.Hero;

public class GoblinMontain extends Goblin {
    public GoblinMontain(Hero hero) {
        super(
                30 * hero.getLevel(),
                30 * hero.getLevel(),
                "Bergsgoblin",
                10 * hero.getLevel(),
                5 * hero.getLevel(),
                5  * hero.getLevel(),
                "Stenklubba",
                "Bergen");
    }
}
