package locations;

import characters.monsters.AbstractMonster;

/**
 * Абстрактный класс для всех локаций в игровом мире
 */
public abstract class AbstractLocation {

    final protected String locationName;
    final protected AbstractMonster[] monsters;

    AbstractLocation(String locationName, AbstractMonster... monsters) {
        this.locationName = locationName;
        this.monsters = monsters;
    }
}
