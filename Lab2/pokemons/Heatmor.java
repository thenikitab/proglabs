import ru.ifmo.se.pokemon.*;

class Heatmor extends Pokemon {

     Heatmor(String name, int level) {

        super(name, level);
        setStats(85, 97, 66, 105, 66, 65);
        addMove(new FocusBlast());
        addMove(new Amnesia());
        addMove(new Tickle());
        addMove(new Tackle());

    }

}
