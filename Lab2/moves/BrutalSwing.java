import ru.ifmo.se.pokemon.*;

class BrutalSwing extends PhysicalMove {

    protected BrutalSwing() {
        super(Type.DARK, 60.0, 100.0);
    }

    @Override
    protected String describe() {
        return "применяет Brutal Swing";
    }
}
