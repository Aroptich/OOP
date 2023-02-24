package Units;

public abstract class Shooter extends Human {
    protected int range;
    protected int cartridges;

    public Shooter(String name, float hp, int maxHp, int attack, int damageMin,
                   int damageMax, int defense, int speed, int cartridges,
                   int range) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.range = range;
        this.cartridges = cartridges;
    }


}
