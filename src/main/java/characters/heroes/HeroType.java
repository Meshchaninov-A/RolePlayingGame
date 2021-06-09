package characters.heroes;

public enum HeroType {
    ARCHER("Archer", 100, 150, 1000),
    WARRIOR("Warrior", 150, 80, 1250);

    private final String name;
    private final long strength;
    private final long agility;
    private final long health;

    HeroType(String name, long strength, long agility, long health) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.health = health;
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
}
