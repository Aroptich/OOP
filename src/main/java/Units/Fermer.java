package Units;

public class Fermer  extends Character{

    public Fermer(int attack, int armor, int damage, int health, int speed, String name) {
        super(attack, armor, damage, health, speed, name="Крестьянин");

    }

    public int getProjectile_feed(){
        // Пополняет снаряды стрелкам
        return 5;

    }
}
