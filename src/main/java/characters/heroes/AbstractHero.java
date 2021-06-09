package characters.heroes;

import characters.AbstractCharacter;

/**
 * Абстрактный класс для всех героев
 * Для сбалансированности, произведение стартовых значений свойств героев strength * agility * health должно быть равно 15000000
 *
 * @author Meshchaninov Aleksey
 */
public abstract class AbstractHero extends AbstractCharacter {

    protected AbstractHero(HeroType hero) {
        super(hero.getName(), hero.getStrength(), hero.getAgility(), hero.getHealth(), 0, 3);
    }

    public void addExperience(long exp) {
        this.experience += exp;
        long experienceForLevelUp = countLevelExp(this.level + 1);
        if (this.experience > experienceForLevelUp) {
            this.level++;
        }
    }
}
