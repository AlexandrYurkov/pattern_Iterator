package ru.otus;
import java.util.Iterator;

public final class Box implements SmallFirstIterator, ColorFirstIterator{

        private final Matryoshka red;        // "red0", "red1", ..., "red9"
        private final Matryoshka green;
        private final Matryoshka blue;
        private final Matryoshka magenta;

        // expected: "red0", "green0", "blue0", "magenta0", "red1", "green1", "blue1", "magenta1",...

        public Box() {
            this.red = new Matryoshka("Red_");
            this.green = new Matryoshka("Green_");
            this.blue = new Matryoshka("Blue_");
            this.magenta = new Matryoshka("Magenta_");
        }

    public Iterator<String> getSmallFirstIterator() {
        return new IteratorSmall(this).getIteratorSmall();
    }

    public Iterator<String> getColorFirstIterator() {

        return new IteratorColors(this).getIteratorColors();
    }

    public Matryoshka getRed() { return red; }
    public Matryoshka getGreen() { return green; }
    public Matryoshka getBlue() { return blue; }
    public Matryoshka getMagenta() { return magenta; }


}

