package Units;

public class Monk extends Character{
    public Monk(int attack, int armor, int damage, int health, int speed, String name) {
        super(attack, armor, damage, health, speed, name);
    }
    public int getTreatment(){
        //Лечение - лечит союзника
        return 30;
    }
}
