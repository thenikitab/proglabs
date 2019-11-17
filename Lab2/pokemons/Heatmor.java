import ru.ifmo.se.pokemon.*;

class Heatmor extends Pokemon {

    protected Heatmor(String name, int level) {

        super(name, level);
        setStats(85.0, 97.0, 66.0, 105.0, 66.0, 65.0);
        addType(Type.FIRE);
        addMove(new FocusBlast());
        addMove(new Amnesia());
        addMove(new Tickle());
        addMove(new Tackle());

    }
}
