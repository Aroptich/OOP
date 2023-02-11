package Units;

public class Crossbowman extends Character{
    int shells; // Показатель снарядов

    public Crossbowman(int attack, int armor, int damage, int health, int speed, String name, int shells) {
        super(attack, armor, damage, health, speed, name);
        this.shells = shells;
    }

    public int getHeadshot(){
        //Выстрел в голову - игнорирует защиту противника
        return 25;
    }
}
