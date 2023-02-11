package Units;

public class Bandit extends Character{


    public Bandit(int attack, int armor, int damage, int health, int speed, String name) {
        super(attack, armor, damage, health, speed, name="Разбойник");
    }

    public int getTheft(){
        //Воровство: Ворует снаряды у стрелков
        return 5;
    }
}
