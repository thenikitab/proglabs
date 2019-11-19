import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class ViceGrip extends PhysicalMove {

    ViceGrip() {

        super(Type.NORMAL, 55, 100);

    }

    @Override
    public String describe() {

        return "применяет ViceGrip";

    }

}