import ru.ifmo.se.pokemon.*;

class Amnesia extends StatusMove {

    protected Amnesia() {
        super(Type.PSYCHIC, 0.0, 0.0);
    }

    public void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect() .turns(-1) .stat(Stat.SPECIAL_DEFENSE, 2));
    }

    @Override
    protected String describe() {
        return "применяет Amnesia";
    }

}