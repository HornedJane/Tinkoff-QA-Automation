package ru.fintech.qa.battleRoyale;

public abstract class Elf {

    protected String name;
    protected String specialization;

    Elf(final String name) {
        this.name = name;
    }

    protected abstract void run();

    protected final void isDead() {
        System.out.println(specialization + " " + name + " dies of fatal wounds");
    }
}
