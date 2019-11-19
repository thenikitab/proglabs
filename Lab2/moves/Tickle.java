import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

class Tickle extends StatusMove {

    Tickle() {

        super(Type.NORMAL, 0, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        pokemon.addEffect(new Effect().stat(Stat.ATTACK, -1).stat(Stat.DEFENSE, -1));

    }

    @Override
    public String describe() {

        return "применяет Tickle";

    }

}