package exercise;

import exercise.components.Cartridge;
import exercise.components.Display;
import exercise.entity.InkjetPrinter;
import exercise.entity.LaserPrinter;
import exercise.entity.Printer;
import exercise.entity.SmartPrinter;

// Main driver class
public class Main {
    public static void main(String[] args) {
        Cartridge cartridge = new Cartridge();
        Display display = new Display();

        Printer inkjet = new InkjetPrinter(cartridge, display);
        inkjet.print();

        Printer laser = new LaserPrinter(cartridge, display);
        laser.print();

        SmartPrinter smart = new SmartPrinter(cartridge, display);
        smart.print();
        smart.scan();
        smart.fax();
    }
}
