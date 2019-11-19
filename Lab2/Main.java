import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {

        Battle battle = new Battle();
        battle.addAlly(new Heatmor("", 1));
        battle.addFoe(new Vikavolt("", 1));
        battle.go();

    }

}