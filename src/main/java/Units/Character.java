package Units;

public class Character {
    int attack;
    int armor;
    int damage;
    int health;
    int speed;
    String name;

    public Character(int attack, int armor, int damage, int health, int speed, String name) {
        this.attack = attack;
        this.armor = armor;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.name = name;
    }
    public int getmeleeAttack(){
        // Нанесение урона в ближнем бою
        return (int) (this.damage + 0.5*this.attack);
    }
    public int getShotAtack(){
        //Нанесение урона в дальнем бою
        return (int) (this.damage + 0.3*this.attack);
    }

}
