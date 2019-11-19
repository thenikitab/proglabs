import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

class Amnesia extends StatusMove {

    Amnesia() {

        super(Type.PSYCHIC, 0, 0);

    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, 2));

    }

    @Override
    public String describe() {

        return "применяет Amnesia";

    }

}