import ru.ifmo.se.pokemon.*;

class Vikavolt extends Charjabug {

    protected Vikavolt(String name, int level) {

        super(name, level);
        setStats(77.0, 70.0, 90.0, 145.0, 75.0,  43.0);
        setType(Type.ELECTRIC);
        addMove(new FlashCannon());

    }

}