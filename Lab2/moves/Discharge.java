import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

class Discharge extends SpecialMove {

    Discharge() {

        super(Type.ELECTRIC, 80, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        pokemon.addEffect(new Effect().chance(0.3).turns(2).attack(0).condition(Status.PARALYZE));

    }

    @Override
    public String describe() {

        return "использует Discharge";

    }

}