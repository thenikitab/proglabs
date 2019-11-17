import ru.ifmo.se.pokemon.*;

class RockTomb extends PhysicalMove {

    protected RockTomb() {
        super(Type.ROCK, 60.0, 95.0);
    }

    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect() .turns(-1) .stat(Stat.SPEED, -1));
    }

    @Override
    protected String describe() {
        return "применяет Rock Tomb";
    }
}