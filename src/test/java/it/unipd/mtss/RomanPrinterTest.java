////////////////////////////////////////////////////////////////////
// Luca Granziero 2075512
// Armando Moda Scarati 2082864
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        assertEquals("  __ \n |   |\n   | |  \n   | |  \n  | | \n |__|\n", RomanPrinter.print(1));
        assertEquals("      \n |   | |   |\n   | |     | |  \n   | |     | |  \n  | |   | | \n || ||\n", RomanPrinter.print(2));
        assertEquals("        __ \n |   | |   | |   |\n   | |     | |     | |  \n   | |     | |     | |  \n  | |   | |   | | \n |__| || ||\n", RomanPrinter.print(3));
		assertEquals("  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n", RomanPrinter.print(4));
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", RomanPrinter.print(5));
        assertEquals(" __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n", RomanPrinter.print(6));
	}
}