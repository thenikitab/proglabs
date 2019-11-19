import ru.ifmo.se.pokemon.*;

class Grubbin extends Pokemon {

    Grubbin(String name, int level) {

        super(name, level);
        setStats(47, 62, 45, 55, 45, 46);
        addMove(new ViceGrip());
        addMove(new Spark());

    }

}