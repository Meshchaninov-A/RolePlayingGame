import characters.heroes.AbstractHero;
import characters.heroes.Archer;

public class GameWorld {

    public static void main(String[] args) {
//        AbstractHero hero = new Archer();
//        sout(hero);
//        hero.addExperience(400);
//        sout(hero);
//        hero.addExperience(450);
//        sout(hero);
        found(10000000,50,1000);
    }

    public static void sout(AbstractHero hero) {
        System.out.println("Agility: " + hero.getAgility());
        System.out.println("Current health: " + hero.getCurrentHealth());
        System.out.println("Level: " + hero.getLevel());
        System.out.println("Exp: " + hero.getExperience());
    }

    private static void found(int value, int start, int end) {
        for (int i = start; i < (end - start); i++) {
            if (value % i == 0) {
                System.out.println(i);
            }
        }

    }
}
