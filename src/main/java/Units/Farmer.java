package OOP.Units;

public class Farmer extends Human {
    protected static int cartridges;
    public Farmer(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
                  int speed, int cartridges, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.cartridges = cartridges;
    }
    public Farmer(String name) {
        super(name, 150.f, 1, 1, 1, 1, 1,
                1);
        this.cartridges = 1;
    }

    public void armiger(Shooter Shooter){  }

    static int getCartridges() {
        return cartridges;
    }
    void setCartridges(int o) {
        this.cartridges = cartridges - o;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Farmer.super.name)
                .append("\t| ATK:\t").append(Farmer.super.attack)
                .append("\t| HP:\t").append(Farmer.super.hp)
               }
}
