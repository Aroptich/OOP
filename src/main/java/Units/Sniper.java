package Units;

public class Sniper extends Shooter{

    public Sniper(String name) {
        super(name, 110.f, 110, 8, 6, 8, 6,
                8, 6, 5);
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append("\t| Arrows: ").append(Sniper.super.cartridges)
               }
}
