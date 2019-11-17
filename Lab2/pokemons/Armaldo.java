class Armaldo extends Anorith {

    protected Armaldo(String name, int level) {

        super(name, level);
        setStats(75.0, 125.0, 100.0, 70.0, 80.0, 45.0);
        addMove(new BrutalSwing());

    }
}
