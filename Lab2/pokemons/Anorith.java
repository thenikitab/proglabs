import ru.ifmo.se.pokemon.*;

class Anorith extends Pokemon {

    Anorith(String name, int level) {

        super(name, level);
        setStats(45, 95, 50, 40, 50, 75);
        addMove(new XScissor());
        addMove(new RockTomb());
        addMove(new Facade());

    }

}