package exercise.entity;

import exercise.components.Cartridge;
import exercise.components.Display;

public abstract class Printer {
    protected Cartridge cartridge;
    protected Display display;

    public Printer(Cartridge cartridge,Display display){
        this.cartridge=cartridge;
        this.display=display;
    }
    public abstract void print();
}
