import ru.ifmo.se.pokemon.*;

class Charjabug extends Grubbin {
    protected Charjabug(String name, int level) {
        super(name, level);
        setStats(57.0, 82.0, 95.0, 55.0, 75.0,  36.0);
        setType(Type.ELECTRIC);
        addMove(new Discharge());
    }

}