import ru.ifmo.se.pokemon.*;

class XScissor extends PhysicalMove {

    protected XScissor() {
        super(Type.BUG, 80.0, 100.0);
    }

    @Override
    protected String describe() {
        return "применяет X-Scissor";
    }
}