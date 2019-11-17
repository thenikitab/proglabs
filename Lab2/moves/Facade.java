import ru.ifmo.se.pokemon.*;

class Facade extends PhysicalMove {

    protected Facade() {
        super(Type.NORMAL, 70.0, 100.0);
    }

    public void applyOppDamage(Pokemon p, double d) {

        double damage = d;

        if (p.getCondition() == Status.POISON ||
                p.getCondition() == Status.BURN ||
                p.getCondition() == Status.PARALYZE)
            damage *= 2;
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        double newAttack = p.getStat(Stat.ATTACK);

        if (p.getCondition() == Status.BURN)
            newAttack = newAttack / 2;

        p.setStats(p.getHP(), newAttack, p.getStat(Stat.DEFENSE), p.getStat(Stat.SPECIAL_ATTACK),
                p.getStat(Stat.SPECIAL_DEFENSE), p.getStat(Stat.SPEED));
    }
    protected String describe() {
        return "применяет Facade";
    }
}