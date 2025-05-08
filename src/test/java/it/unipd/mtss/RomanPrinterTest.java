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

        // 7 (VII)
        assertEquals(
            " __      __  _____   _____ \n" +
            " \\ \\    / / |_   _| |_   _|\n" +
            "  \\ \\  / /    | |     | |  \n" +
            "   \\ \\/ /     | |     | |  \n" +
            "    \\  /     _| |_   _| |_ \n" +
            "     \\/     |_____| |_____|\n",
            RomanPrinter.print(7));

        // 8 (VIII)
        assertEquals(
            " __      __  _____   _____   _____ \n" +
            " \\ \\    / / |_   _| |_   _| |_   _|\n" +
            "  \\ \\  / /    | |     | |     | |  \n" +
            "   \\ \\/ /     | |     | |     | |  \n" +
            "    \\  /     _| |_   _| |_   _| |_ \n" +
            "     \\/     |_____| |_____| |_____|\n",
            RomanPrinter.print(8));

        // 9 (IX)
        assertEquals(
            "  _____  __   __\n" +
            " |_   _| \\ \\ / /\n" +
            "   | |    \\ V / \n" +
            "   | |     > <  \n" +
            "  _| |_   / . \\ \n" +
            " |_____| /_/ \\_\\\n",
            RomanPrinter.print(9));

        // 10 (X)
        assertEquals(
            " __   __\n" +
            " \\ \\ / /\n" +
            "  \\ V / \n" +
            "   > <  \n" +
            "  / . \\ \n" +
            " /_/ \\_\\\n",
            RomanPrinter.print(10));

        // 15 (XV)
        assertEquals(
            " __   __ __      __\n" +
            " \\ \\ / / \\ \\    / /\n" +
            "  \\ V /   \\ \\  / / \n" +
            "   > <     \\ \\/ /  \n" +
            "  / . \\     \\  /   \n" +
            " /_/ \\_\\     \\/    \n",
            RomanPrinter.print(15));

        // 19 (XIX)
        assertEquals(
            " __   __  _____  __   __\n" +
            " \\ \\ / / |_   _| \\ \\ / /\n" +
            "  \\ V /    | |    \\ V / \n" +
            "   > <     | |     > <  \n" +
            "  / . \\   _| |_   / . \\ \n" +
            " /_/ \\_\\ |_____| /_/ \\_\\\n",
            RomanPrinter.print(19));

        // 20 (XX)
        assertEquals(
            " __   __ __   __\n" +
            " \\ \\ / / \\ \\ / /\n" +
            "  \\ V /   \\ V / \n" +
            "   > <     > <  \n" +
            "  / . \\   / . \\ \n" +
            " /_/ \\_\\ /_/ \\_\\\n",
            RomanPrinter.print(20));

        // 30 (XXX)
        assertEquals(
            " __   __ __   __ __   __\n" +
            " \\ \\ / / \\ \\ / / \\ \\ / /\n" +
            "  \\ V /   \\ V /   \\ V / \n" +
            "   > <     > <     > <  \n" +
            "  / . \\   / . \\   / . \\ \n" +
            " /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n",
            RomanPrinter.print(30));

        // 40 (XL)
        assertEquals(
            " __   __  _      \n" +
            " \\ \\ / / | |     \n" +
            "  \\ V /  | |     \n" +
            "   > <   | |     \n" +
            "  / . \\  | |____ \n" +
            " /_/ \\_\\ |______|\n",
            RomanPrinter.print(40));

        // 50 (L)
        assertEquals(
            "  _      \n" +
            " | |     \n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            " |______|\n",
            RomanPrinter.print(50));

        // 60 (LX)
        assertEquals(
            "  _       __   __\n" +
            " | |      \\ \\ / /\n" +
            " | |       \\ V / \n" +
            " | |        > <  \n" +
            " | |____   / . \\ \n" +
            " |______| /_/ \\_\\\n",
            RomanPrinter.print(60));

        // 70 (LXX)
        assertEquals(
            "  _       __   __ __   __\n" +
            " | |      \\ \\ / / \\ \\ / /\n" +
            " | |       \\ V /   \\ V / \n" +
            " | |        > <     > <  \n" +
            " | |____   / . \\   / . \\ \n" +
            " |______| /_/ \\_\\ /_/ \\_\\\n",
            RomanPrinter.print(70));

        // 80 (LXXX)
        assertEquals(
            "  _       __   __ __   __ __   __\n" +
            " | |      \\ \\ / / \\ \\ / / \\ \\ / /\n" +
            " | |       \\ V /   \\ V /   \\ V / \n" +
            " | |        > <     > <     > <  \n" +
            " | |____   / . \\   / . \\   / . \\ \n" +
            " |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n",
            RomanPrinter.print(80));

        // 90 (XC)
        assertEquals(
            " __   __   _____ \n" +
            " \\ \\ / /  / ____|\n" +
            "  \\ V /  | |     \n" +
            "   > <   | |     \n" +
            "  / . \\  | |____ \n" +
            " /_/ \\_\\  \\_____|\n",
            RomanPrinter.print(90));

        // 100 (C)
        assertEquals(
            "   _____ \n" +
            "  / ____|\n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            "  \\_____|\n",
            RomanPrinter.print(100));

        // 200 (CC)
        assertEquals(
            "   _____    _____ \n" +
            "  / ____|  / ____|\n" +
            " | |      | |     \n" +
            " | |      | |     \n" +
            " | |____  | |____ \n" +
            "  \\_____|  \\_____|\n",
            RomanPrinter.print(200));

        // 300 (CCC)
        assertEquals(
            "   _____    _____    _____ \n" +
            "  / ____|  / ____|  / ____|\n" +
            " | |      | |      | |     \n" +
            " | |      | |      | |     \n" +
            " | |____  | |____  | |____ \n" +
            "  \\_____|  \\_____|  \\_____|\n",
            RomanPrinter.print(300));

        // 400 (CD)
        assertEquals(
            "   _____   _____ \n" +    
            "  / ____| |  __ \\\n" +   
            " | |      | |  | |\n" +  
            " | |      | |  | |\n" +
            " | |____  | |__| |\n" +
            "  \\_____| |_____/ \n",   
            RomanPrinter.print(400));

        // 500 (D)
        assertEquals(
            "  _____ \n" +
            " |  __ \\\n" +
            " | |  | |\n" +
            " | |  | |\n" +
            " | |__| |\n" +
            " |_____/ \n",
            RomanPrinter.print(500));
    }
}
