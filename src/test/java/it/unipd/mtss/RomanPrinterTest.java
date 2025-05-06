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
		assertEquals("             \n \ \    / / |   | |   |\n  \ \  / /    | |     | |  \n   \ \/ /     | |     | |  \n    \  /     | |   | | \n     \/     || ||\n", RomanPrinter.print(7));
        assertEquals("               __ \n \ \    / / |   | |   | |   |\n  \ \  / /    | |     | |     | |  \n   \ \/ /     | |     | |     | |  \n    \  /     | |   | |   | | \n     \/     |__| || ||\n", RomanPrinter.print(8));
        assertEquals("  __     __\n |   | \ \ / /\n   | |    \ V / \n   | |     > <  \n  | |   / . \ \n |__| // \\\n", RomanPrinter.print(9));
        assertEquals("    \n \ \ / /\n  \ V / \n   > <  \n  / . \ \n // \\\n", RomanPrinter.print(10));
		assertEquals(" __   __ __      __\n \\ \\ / / \\ \\    / /\n  \\ V /   \\ \\  / / \n   > <     \\ \\/ /  \n  / . \\     \\  /   \n /_/ \\_\\     \\/    \n", RomanPrinter.print(15));
        assertEquals(" __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n", RomanPrinter.print(19));
        assertEquals(" __   __ __   __\n \\ \\ / / \\ \\ / /\n  \\ V /   \\ V / \n   > <     > <  \n  / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(20));
	}
}