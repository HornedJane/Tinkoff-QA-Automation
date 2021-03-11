package ru.fintech.qa.battleRoyale;

public class Engineer extends Dwarf implements withHandgun, withWrench {

    Engineer(final String name) {

        super(name);
        specialization = "Engineer";

    }

    //withHandgun
    @Override
    public final void fire() {
        System.out.println(specialization + " " + name
                + " fires his handgun at the opponent.'Aye, me loves a good powder smell in a mornin.");
    }

    @Override
    public final void grenade() {
        System.out.println(specialization + " " + name
                + " throws a scrap-made grenade that blows just before it hits the ground.");
    }

    @Override
    public final void dodge() {
        System.out.println(specialization + " " + name
                + " dodges an attack. 'And they say an elgis is swifter than a dwarf eh?'");
    }

    //withWrench
    @Override
    public final void bonk() {
        System.out.println(specialization + " " + name
                + " strikes with his trusty wrench. *BONK*, echoes through an ears of a foe.");
    }

    @Override
    public final void turret() {
        System.out.println(specialization + " " + name
                + " deploys a turret that immediately fires a rain of bullets to the enemy.");
    }

    @Override
    public final void maneuver() {
        System.out.println(specialization + " " + name
                + " throws a pouch under his feet emitting a cloud of smoke and vanishes from sight'");
    }

    //Dwarf
    @Override
    protected final void run() {
        System.out.println(specialization + " " + name
                + " running towards his foe. '*huff-huff* Ya just wait till i get to ya!'");
    }
}
