package characters.monsters;

public enum MonsterType {
    BARBARIAN("Barbarian", 50, 70, 1000, 50),
    GOBLIN("Goblin", 50, 70, 850, 50),
    DRAGON("Dragon", 95, 85, 800, 50),
    MUMMY("Mummy", 50, 70, 1000, 50),
    SNAKE("Snake", 70, 100, 700, 50);

    private final String name;
    private final long strength;
    private final long agility;
    private final long health;
    private final long gold;

    MonsterType(String name, long strength, long agility, long health, long gold) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.health = health;
        this.gold = gold;
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

    public long getHealth() {
        return health;
    }

    public long getGold() {
        return gold;
    }
}
