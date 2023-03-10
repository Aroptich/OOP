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
    protected Vector2D coords;
    public String state;

    protected Human(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                    int defense, int speed, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
        this.state = "Stand";
    }
    public int getDefense() { return this.defense; }
    public int getSpeed() { return this.speed; }
    public float getHp () { return this.hp; }
    public void setHp (float hp) { this.hp = hp; }
    public int getMaxHp () { return this.maxHp;}

    protected void makeDamage (Human unit) {
        int damage = unit.getDefense() - attack;
        float hp;
        if(damage < 0) {
            hp = unit.getHp() - damageMax;
        } else if (damage > 0) {
            hp = unit.getHp() - damageMin;
        } else {
            hp = unit.getHp() - ((damageMax+damageMin)/2);
        }
        if (hp <= 0) {
            unit.state = "Die";
            unit.setHp(0);
        } else {
            unit.setHp(hp);
        }
    }

    protected int findNearest(ArrayList<Human> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }
    public int[] getCoords() { return new int[]{coords.posX, coords.posY};}
    @Override
    public String toString() {
        return name + "\t" +
                getEmoji() +
                "\t| \uD83E\uDE78:" + Math.round(hp) +
                "\t\uD83D\uDEE1:" + defense +
                " \t\uD83D\uDDE1:" + attack +
                " \t\uD83D\uDCA5:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                "\t\t";
    }
    public String getEmoji() {
        return null;
    }
}
