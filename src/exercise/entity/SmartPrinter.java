package exercise.entity;

import exercise.components.Cartridge;
import exercise.components.Display;
import exercise.components.Faxable;
import exercise.components.Scannable;

// SmartPrinter with scanning and faxing capabilities
public class SmartPrinter extends Printer implements Scannable, Faxable {

    public SmartPrinter(Cartridge cartridge, Display display) {
        super(cartridge, display);
    }

    @Override
    public void print() {
        cartridge.use();
        display.show("SmartPrinter: printing document...");
    }

    @Override
    public void scan() {
        display.show("SmartPrinter: scanning document...");
    }

    @Override
    public void fax() {
        display.show("SmartPrinter: faxing document...");
    }
}