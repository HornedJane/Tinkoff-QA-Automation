package BattleRoyale;

public class WhiteLion extends Elf implements withHalberd, withLongsword {

    WhiteLion(final String name) {
        super(name);
        specialization = "WhiteLion";
    }

    //withHalberd
    @Override
    public final void halberdSlash() {
        System.out.println(specialization + " " + name
                + " makes a wide slash with his halberd");
    }

    @Override
    public final void lionThrust() {
        System.out.println(specialization + " " + name
                + " calls to his lion as they thrust together through their enemy");
    }

    @Override
    public final void defend() {
        System.out.println(specialization + " " + name
                + " blocks an incoming attack with grace of an elf and a strength of a lion");
    }

    //withLongSword
    @Override
    public final void longswordSlash() {
        System.out.println(specialization + " " + name
                + " dashes to an enemy making a series of fast slashes with his blade");
    }

    @Override
    public final void lionRoar() {
        System.out.println(specialization + " " + name
                + " signals his lion to make a stunning roar, as he strikes his opponent with a blade");
    }

    @Override
    public final void parry() {
        System.out.println(specialization + " " + name
                + " parries an attack laughing at his opponent's slowness");
    }

    //elf
    @Override
    public final void run() {
        System.out.println(specialization + " " + name
                + " runs towards his target along with his white lion");
    }
}
