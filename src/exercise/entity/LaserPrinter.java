package exercise.entity;

import exercise.components.Cartridge;
import exercise.components.Display;

public class LaserPrinter extends Printer {
    public LaserPrinter(Cartridge cartridge, Display display) {
        super(cartridge, display);
    }

    @Override
    public void print() {
        cartridge.use();
        display.show("Laser printing...");
    }
}
