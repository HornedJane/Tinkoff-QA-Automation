package ru.fintech.qa.battleRoyale;

public class Battle {

    protected static void start() {

        IronBreaker dwarf1 = new IronBreaker("Okri");
        Engineer dwarf2 = new Engineer("Bardin");
        WayWatcher elf1 = new WayWatcher("Kerillian");
        WhiteLion elf2 = new WhiteLion("Alastar");

        elf1.fireArrow();
        dwarf2.dodge();
        elf2.run();
        dwarf1.shout();
        dwarf2.fire();
        elf1.invisible();
        elf1.run();
        dwarf2.bonk();
        dwarf1.hammerStrike();
        elf1.isDead();
        dwarf1.shieldUp();
        elf2.lionThrust();
        dwarf1.shieldBash();
        elf2.parry();
        elf2.lionRoar();
        dwarf2.maneuver();
        elf2.halberdSlash();
        dwarf1.isDead();
        dwarf2.grenade();
        elf2.isDead();

        System.out.println(dwarf2.name + " stands victorious as he writes down a grudge on an elves for killing his comrade");
        System.out.println("Happy end. \nNo one gonna miss bloody elves anyway, eh?");
    }

}
