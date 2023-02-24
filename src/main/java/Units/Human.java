package Units;

import java.util.ArrayList;

public abstract class Human implements GameInterfase {
    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;


    public Human(String name, float hp, int maxHp, int attack, int damageMin,
                 int damageMax, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;

    }

    public int getAttack() {
        return attack;
    }
    public int getDefense() { return defense; }
    public int getDamageMin() { return damageMin; }

    public int getDamageMax() { return damageMax; }
    public int getSpeed() { return speed; }

    public float getHp () { return hp; }

    public float setHp (float p) { return hp-p; }



    @Override
    public StringBuilder getInfo() {
        return null;
    }
}
