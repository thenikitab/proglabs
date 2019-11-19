import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class BrutalSwing extends PhysicalMove {

    BrutalSwing() {

        super(Type.DARK, 60, 100);

    }

    @Override
    public String describe() {

        return "применяет Brutal Swing";

    }

}