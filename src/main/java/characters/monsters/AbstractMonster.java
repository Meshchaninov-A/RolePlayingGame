package characters.monsters;

import characters.AbstractCharacter;

public class Monster extends AbstractCharacter {

    protected Monster(String name, long strength, long agility, long health, long gold, int level) {
        super(name, strength, agility, health, gold, level);
    }
}
