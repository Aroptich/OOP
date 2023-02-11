import Units.*;

public class MiniGame {
    public static void main(String[] args) {
        Fermer fermer = new Fermer(1, 1, 1, 1, 3, "Крестьянин");
        Bandit bandit = new Bandit(8, 3, 3, 10, 6, "Разбойник");
        Sniper sniper = new Sniper(12, 10, 9, 15, 9, "Снайпер", 10);
        Wizard wizard = new Wizard(17,12,14,30,9, "Волшебник");
        Spearman spearman = new Spearman(4,5,2,10,4,"Копейщик");
        Crossbowman crossbowman = new Crossbowman(6,3,3,10,4,"Арбалетчик", 12);
        Monk monk = new Monk(12,7,10,30,5,"Монах");


    }

}
