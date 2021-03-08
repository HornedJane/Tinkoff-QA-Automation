package BattleRoyale;

public abstract class Dwarf {

    protected String name;
    protected String specialization;

    Dwarf(final String name) {

        this.name = name;

    }

    protected abstract void run();

    protected final void isDead() {

        System.out.println(specialization + " " + name + " releases his last war cry as he falls in battle");
    }

}
