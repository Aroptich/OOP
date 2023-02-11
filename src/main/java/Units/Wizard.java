package Units;

public class Wizard extends Character{
    public Wizard(int attack, int armor, int damage, int health, int speed, String name) {
        super(attack, armor, damage, health, speed, name="Волшебник");
    }
    public int getSpells(){
        return 20;
    }
}
