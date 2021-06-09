import characters.AbstractCharacter;
import characters.heroes.AbstractHero;

@FunctionalInterface
public interface Action {
    void doAction(AbstractHero abstractHero, AbstractCharacter character);
}