import ru.ifmo.se.pokemon.*;

class Tackle extends PhysicalMove {

    protected Tackle() {
        super(Type.NORMAL, 40.0, 100.0);
    }

    @Override
    protected String describe() {
        return "применяет Tackle";
    }

}