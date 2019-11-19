import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

class Spark extends PhysicalMove {

    Spark() {

        super(Type.ELECTRIC, 65, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        pokemon.addEffect(new Effect().chance(0.3).turns(2).attack(0).condition(Status.PARALYZE));

    }

    @Override
    public String describe() {

        return "применяет Spark";

    }

}