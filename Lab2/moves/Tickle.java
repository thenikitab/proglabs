import ru.ifmo.se.pokemon.*;

class Tickle extends StatusMove {

    protected Tickle() {
        super(Type.NORMAL, 0.0, 100.0);
    }

    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect() .turns(-1) .stat(Stat.DEFENSE, -1) .stat(Stat.ATTACK, -1));
    }

    @Override
    protected String describe() {
        return "применяет Tickle";
    }

}