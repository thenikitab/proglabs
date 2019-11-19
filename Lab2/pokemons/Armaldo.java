import ru.ifmo.se.pokemon.*;

class Armaldo extends Anorith {

    Armaldo(String name, int level) {

        super(name, level);
        setStats(75, 125, 100, 70, 80, 45);
        addMove(new BrutalSwing());

    }

}