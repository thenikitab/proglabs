import ru.ifmo.se.pokemon.*;

class Grubbin extends Pokemon {
    protected Grubbin(String name, int level){
        super(name, level);
        setStats(47.0, 62.0, 45.0, 55.0, 45.0,  46.0);
        addType(Type.BUG);
        addMove(new ViceGrip());
        addMove(new Spark());
    }

}