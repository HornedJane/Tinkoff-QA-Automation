package BattleRoyale;

public class IronBreaker extends Dwarf implements withTHAxe, withHammerShield {

    IronBreaker(final String name) {

        super(name);
        specialization = "IronBreaker";

    }

    //withHammerShield
    @Override
    public final void hammerStrike() {
        System.out.println(specialization + " " + name
                + " strikes a foe with a hammer. 'That'll teach ya!");
    }

    @Override
    public final void shieldBash() {
        System.out.println(specialization + " " + name
                + " bashes an enemy with a shield. 'Don't drop yer teeth, coward!'");
    }

    @Override
    public final void shieldUp() {
        System.out.println(specialization + " " + name
                + " raises up his shield. 'Aye lad, strike me as hard as ya can!'");
    }

    //withTHAxe
    @Override
    public final void slash() {
        System.out.println(specialization + " " + name
                + " swings his giant axe towards an enemy. 'Don't drop yer head. Ya bastard!");
    }

    @Override
    public final void shout() {
        System.out.println(specialization + " " + name
                + " shouting, forcing his opponents to cover ears from a sound of a mighty dwarfish voice.");
    }

    @Override
    public final void block() {
        System.out.println(specialization + " " + name
                + " raising his axe, blocking an incoming attack.'Is that all ya got?!'");
    }

    //Dwarf
    @Override
    protected final void run() {
        System.out.println(specialization + " " + name
                + " fast sprints towards his foe, well, as fast as a dwarf can sprint");
    }

}
