package characters.monsters;

import characters.AbstractCharacter;

/**
 * Абстрактный класс для всех монстров в игровом мире
 *
 * @author Meshchaninov Aleksey
 */
public class AbstractMonster extends AbstractCharacter {

    protected AbstractMonster(MonsterType monster, int level) {
        super(monster.getName(), monster.getStrength(), monster.getAgility(), monster.getHealth(), monster.getGold(), level);
    }

}
