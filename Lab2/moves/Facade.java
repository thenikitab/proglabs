import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

class Facade extends PhysicalMove {

    Facade() {

        super(Type.NORMAL, 70, 100);

    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {

        double damage = v;

        if (pokemon.getCondition() == Status.BURN ||
                pokemon.getCondition() == Status.POISON ||
                pokemon.getCondition() == Status.PARALYZE) {

            damage = damage * 2;

        }

        super.applyOppDamage(pokemon, damage);

    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        double newAttack = pokemon.getStat(Stat.ATTACK);

        if (pokemon.getCondition() == Status.BURN) {

            newAttack = newAttack / 2;

        }

        pokemon.setStats(pokemon.getHP(), newAttack, pokemon.getStat(Stat.DEFENSE), pokemon.getStat(Stat.SPECIAL_ATTACK),
                pokemon.getStat(Stat.SPECIAL_DEFENSE), pokemon.getStat(Stat.SPEED));

    }

    @Override
    public String describe() {

        return "применяет Facade";

    }

}