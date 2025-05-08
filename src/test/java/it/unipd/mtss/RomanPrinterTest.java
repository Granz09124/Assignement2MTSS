////////////////////////////////////////////////////////////////////
// Luca Granziero 2075512
// Armando Moda Scarati 2082864
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        // 1 (I)
        assertEquals(
            "  _____ \n" +
            " |_   _|\n" +
            "   | |  \n" +
            "   | |  \n" +
            "  _| |_ \n" +
            " |_____|\n",
            RomanPrinter.print(1));

        // 2 (II)
        assertEquals(
            "  _____   _____ \n" +
            " |_   _| |_   _|\n" +
            "   | |     | |  \n" +
            "   | |     | |  \n" +
            "  _| |_   _| |_ \n" +
            " |_____| |_____|\n",
            RomanPrinter.print(2));

        // 3 (III)
        assertEquals(
            "  _____   _____   _____ \n" +
            " |_   _| |_   _| |_   _|\n" +
            "   | |     | |     | |  \n" +
            "   | |     | |     | |  \n" +
            "  _| |_   _| |_   _| |_ \n" +
            " |_____| |_____| |_____|\n",
            RomanPrinter.print(3));

        // 4 (IV)
        assertEquals(
            "  _____  __      __\n" +
            " |_   _| \\ \\    / /\n" +
            "   | |    \\ \\  / / \n" +
            "   | |     \\ \\/ /  \n" +
            "  _| |_     \\  /   \n" +
            " |_____|     \\/    \n",
            RomanPrinter.print(4));

        // 5 (V)
        assertEquals(
            " __      __\n" +
            " \\ \\    / /\n" +
            "  \\ \\  / / \n" +
            "   \\ \\/ /  \n" +
            "    \\  /   \n" +
            "     \\/    \n",
            RomanPrinter.print(5));

        // 6 (VI)
        assertEquals(
            " __      __  _____ \n" +
            " \\ \\    / / |_   _|\n" +
            "  \\ \\  / /    | |  \n" +
            "   \\ \\/ /     | |  \n" +
            "    \\  /     _| |_ \n" +
            "     \\/     |_____|\n",
            RomanPrinter.print(6));

       

}
