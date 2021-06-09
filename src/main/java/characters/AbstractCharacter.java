package characters;

/**
 * Абстрактный класс для всех персонажей в игре, которые участвуют в поединках
 *
 * @author Meshchaninov Aleksey
 */
public abstract class AbstractCharacter {
    /**
     * Количество опыта, которое необходимо для перехода на следующий уровень
     */
    private static final int EXPERIENCE_RATIO = 250;
    final protected String name;
    protected long strength;
    protected long agility;
    protected long maxHealth;
    protected long currentHealth;
    protected long gold;
    protected long experience;
    protected int level;

    protected AbstractCharacter(String name) {
        this.name = name;
    }

    protected AbstractCharacter(String name, long strength, long agility, long health, long gold, int level) {
        this(name);
        this.strength = strength;
        this.agility = agility;
        this.maxHealth = this.currentHealth = health;
        this.gold = gold;
        this.level = Math.max(level, 1);
        this.experience = countLevelExp(this.level);
    }


    public String getName() {
        return name;
    }

    public long getStrength() {
        return strength;
    }

    public long getAgility() {
        return agility;
    }

    public long getMaxHealth() {
        return maxHealth;
    }

    public long getCurrentHealth() {
        return currentHealth;
    }

    public long getGold() {
        return gold;
    }

    public long getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    /**
     * Метод по проверке здоровья персонажа. Если оно равно 0 - персонаж погиб.
     *
     * @return true- если персонаж жив
     */
    public boolean isAlive() {
        return currentHealth != 0;
    }

    protected long countLevelExp(int level) {
        long experience = (level - 1L) * EXPERIENCE_RATIO;
        if (level > 1) {
            experience += countLevelExp(--level);
        }
        return experience;
    }
}
