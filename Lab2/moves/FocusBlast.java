import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

class FocusBlast extends SpecialMove {

    FocusBlast() {

        super(Type.FIGHTING, 120, 70);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1));

    }

    @Override
    public String describe() {

        return "применяет Focus Blast";

    }

}