import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class Tackle extends PhysicalMove {

    Tackle() {

        super(Type.NORMAL, 40, 100);

    }

    @Override
    public String describe() {

        return "применяет Tackle";

    }

}