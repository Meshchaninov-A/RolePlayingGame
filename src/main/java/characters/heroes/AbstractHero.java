package characters.heroes;

import characters.AbstractCharacter;

public abstract class Hero extends AbstractCharacter {

    protected Hero(String name, long strength, long agility, long health, long gold, int level) {
        super(name, strength, agility, health, gold, level);
    }
}
