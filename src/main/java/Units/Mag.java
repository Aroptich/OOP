package Unit;

import Units.Human;

public abstract class Mag extends Human {
    protected int mana;
    protected int maxMana;
    public Mag(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense);
        this.mana = mana;
        this.maxMana = maxMana;
    }
