package exercise.entity;

import exercise.components.Cartridge;
import exercise.components.Display;

public class InkjetPrinter extends Printer {
    public InkjetPrinter(Cartridge cartridge, Display display) {
        super(cartridge, display);
    }

    @Override
    public void print() {
        cartridge.use();
        display.show("Inkjet printing...");
    }
}
