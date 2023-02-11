package Units;

public class Sniper extends Character{
    int shells;

    public Sniper(int attack, int armor, int damage, int health, int speed, String name, int shells) {
        super(attack, armor, damage, health, speed, name);
        this.shells = shells;
    }

    public int getaccurate_shot(){
        //Точный выстрел
        return 15;
    }
}
