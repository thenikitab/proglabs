import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

class RockTomb extends PhysicalMove {

    RockTomb() {

        super(Type.ROCK, 60,95);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        pokemon.addEffect(new Effect().stat(Stat.SPEED, -1));

    }

    @Override
    public String describe() {

        return "применяет Rock Tomb";

    }

}