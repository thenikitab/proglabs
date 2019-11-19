import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class XScissor extends PhysicalMove {

    XScissor() {

        super(Type.BUG, 80, 100);

    }

    @Override
    public String describe() {

        return "применяет X-Scissor";

    }

}