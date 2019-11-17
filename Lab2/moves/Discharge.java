import ru.ifmo.se.pokemon.*;
class Discharge extends SpecialMove{
    protected Discharge() {
        super(Type.ELECTRIC, 80.0, 100.0);
    }
    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect() .chance(0.3) .turns(-1) .condition(Status.PARALYZE) );
    }
    @Override
    protected String describe() {return "применяет Discharge" ;}
}