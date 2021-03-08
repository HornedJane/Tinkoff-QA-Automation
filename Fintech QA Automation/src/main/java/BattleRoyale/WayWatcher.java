package BattleRoyale;

public class WayWatcher extends Elf implements withBow, withDaggers {

    WayWatcher(final String name) {
        super(name);
        specialization = "WayWatcher";
    }

    //withBow
    @Override
    public final void fireArrow() {
        System.out.println(specialization + " " + name
                + " fires an arrow with an elvish precision and impressive speed");
    }

    @Override
    public final void poisonArrow() {
        System.out.println(specialization + " " + name
                + " fires an arrow that emits a deadly cloud of poison at a target location");
    }

    @Override
    public final void evade() {
        System.out.println(specialization + " " + name
                + " gracefully dodges an incoming attack");
    }

    //withDaggers
    @Override
    public final void backStab() {
        System.out.println(specialization + " " + name
                + " swift as a wind, moves behind a targets back and sticks both dagger into flesh");
    }

    @Override
    public final void throwDagger() {
        System.out.println(specialization + " " + name
                + " instantly throws dagger at her opponent. A cheap but effective move");
    }

    @Override
    public final void invisible() {
        System.out.println(specialization + " " + name
                + " Vanishes as a shadow, forcing an attacker to miss its mark");
    }

    //elf
    @Override
    public final void run() {
        System.out.println(specialization + " " + name
                + " runs towards her target with an immense speed");
    }
}
