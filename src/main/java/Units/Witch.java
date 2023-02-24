package Units;

public class Witch extends Mag{

    public Witch(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                 int defense, int speed, int mana, int maxMana, int posX, int posY ) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana);
    }
    public Witch(String name) {
        super(name, 130.f, 130, 15, 15, 5, 2,
                6, 6 ,5);
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Witch.super.name)
                .append("\t| ATK:\t").append(Witch.super.attack)
                .append("\t| HP:\t").append(Witch.super.hp)
                .append("\t| MP:\t").append(Witch.super.mana)
                }
}
