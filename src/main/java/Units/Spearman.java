package Units;

public class Spearman extends Character{
    public Spearman(int attack, int armor, int damage, int health, int speed, String name) {
        super(attack, armor, damage, health, speed, name="Копейщик");
    }
    public int getPiercing_Thrust(){
        //Пронзительный кол - игнорирует 30% защиты противника
        return 15;
    }
}
