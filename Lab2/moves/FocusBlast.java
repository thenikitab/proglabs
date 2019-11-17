import ru.ifmo.se.pokemon.*;

class FocusBlast extends SpecialMove {

    protected FocusBlast() {
        super(Type.FIGHTING, 120.0, 70.0);
    }

    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect() .chance(0.1) .turns(-1) .stat(Stat.SPECIAL_DEFENSE, -1));
    }

    @Override
    protected String describe() {
        return "применяет Focus Blast";
    }

}