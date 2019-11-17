import ru.ifmo.se.pokemon.*;
class FlashCannon extends SpecialMove{
    protected FlashCannon() {
        super(Type.ELECTRIC, 80.0, 100.0);
    }
    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect() .chance(0.1) .turns(-1) .stat(Stat.DEFENSE, -1) );
    }
    @Override
    protected String describe() {return "применяет Flash Cannon" ;}
}