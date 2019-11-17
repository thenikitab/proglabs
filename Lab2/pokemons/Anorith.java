import ru.ifmo.se.pokemon.*;

class Anorith extends Pokemon {

    protected Anorith(String name, int level) {

        super(name, level);
        setStats(45.0, 95.0, 50.0, 40.0, 50.0, 75.0);
        addType(Type.BUG);
        addType(Type.ROCK);
        addMove(new XScissor());
        addMove(new RockTomb());
        addMove(new Facade());

    }
}