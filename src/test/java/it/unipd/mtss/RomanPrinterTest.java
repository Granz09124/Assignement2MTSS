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
		assertEquals("  __ \n |   |\n   | |  \n   | |  \n  | | \n ||\n", RomanPrinter.print(1));
		assertEquals("      \n |   | |   |\n   | |     | |  \n   | |     | |  \n  | |   | | \n || ||\n", RomanPrinter.print(2));
		assertEquals("        __ \n |   | |   | |   |\n   | |     | |     | |  \n   | |     | |     | |  \n  | |   | |   | | \n || || ||\n", RomanPrinter.print(3));
		assertEquals("  _____  __      \n |   | \ \    / /\n   | |    \ \  / / \n   | |     \ \/ /  \n  | |     \  /   \n ||     \/    \n", RomanPrinter.print(4));
		assertEquals(" __      _\n \ \    / /\n  \ \  / / \n   \ \/ /  \n    \  /   \n     \/    \n", RomanPrinter.print(5));
		assertEquals(" __      __  _____ \n \ \    / / |   _|\n  \ \  / /    | |  \n   \ \/ /     | |  \n    \  /     | | \n     \/     ||\n", RomanPrinter.print(6));
		assertEquals("             \n \ \    / / |   | |   |\n  \ \  / /    | |     | |  \n   \ \/ /     | |     | |  \n    \  /     | |   | | \n     \/     || ||\n", RomanPrinter.print(7));
		assertEquals("               __ \n \ \    / / |   | |   | |   |\n  \ \  / /    | |     | |     | |  \n   \ \/ /     | |     | |     | |  \n    \  /     | |   | |   | | \n     \/     |__| || ||\n", RomanPrinter.print(8));
		assertEquals("  __     \n |   | \ \ / /\n   | |    \ V / \n   | |     > <  \n  | |   / . \ \n || // \\\n", RomanPrinter.print(9));
		assertEquals("    \n \ \ / /\n  \ V / \n   > <  \n  / . \ \n // \\\n", RomanPrinter.print(10));
		assertEquals(" __   __ __      __\n \ \ / / \ \    / /\n  \ V /   \ \  / / \n   > <     \ \/ /  \n  / . \     \  /   \n // \\     \/    \n", RomanPrinter.print(15));
		assertEquals(" __   __  _____  __   \n \ \ / / |   | \ \ / /\n  \ V /    | |    \ V / \n   > <     | |     > <  \n  / . \   | |   / . \ \n // \\ || // \\\n", RomanPrinter.print(19));
		assertEquals(" __   __ __   \n \ \ / / \ \ / /\n  \ V /   \ V / \n   > <     > <  \n  / . \   / . \ \n // \\ // \\\n", RomanPrinter.print(20));
		assertEquals("            \n \ \ / / \ \ / / \ \ / /\n  \ V /   \ V /   \ V / \n   > <     > <     > <  \n  / . \   / . \   / . \ \n // \\ // \\ // \\\n", RomanPrinter.print(30));
		assertEquals("            \n \ \ / / | |     \n  \ V /  | |     \n   > <   | |     \n  / . \  | | \n // \\ ||\n", RomanPrinter.print(40));
		assertEquals("        \n | |     \n | |     \n | |     \n | | \n ||\n", RomanPrinter.print(50));
		assertEquals("  _       __   \n | |      \ \ / /\n | |       \ V / \n | |        > <  \n | |__   / . \ \n || // \\\n", RomanPrinter.print(60));
		assertEquals("  _       __   __ __   \n | |      \ \ / / \ \ / /\n | |       \ V /   \ V / \n | |        > <     > <  \n | |   / . \   / . \ \n || // \\ // \_\\n", RomanPrinter.print(70));
		assertEquals("  _       __   __ __   __ __   \n | |      \ \ / / \ \ / / \ \ / /\n | |       \ V /   \ V /   \ V / \n | |        > <     > <     > <  \n | |   / . \   / . \   / . \ \n || // \\ // \\ // \\\n", RomanPrinter.print(80));
		assertEquals(" __   __   _____ \n \ \ / /  / |\n  \ V /  | |     \n   > <   | |     \n  / . \  | | \n // \_\  \|\n", RomanPrinter.print(90));
		assertEquals("   _____ \n  / |\n | |     \n | |     \n | | \n  \|\n", RomanPrinter.print(100));
		assertEquals("        \n  / |  / |\n | |      | |     \n | |      | |     \n | |  | | \n  \|  \|\n", RomanPrinter.print(200));
		assertEquals("            \n  / |  / |  / |\n | |      | |      | |     \n | |      | |      | |     \n | |  | |  | | \n  \|  \|  \|\n", RomanPrinter.print(300));
		assertEquals("        \n  / | |   \ \\n | |      | |  | |\n | |      | |  | |\n | |  | || |\n  \| |/ \n", RomanPrinter.print(400));
		assertEquals("  __  \n |   \ \\n | |  | |\n | |  | |\n | || |\n |/ \n", RomanPrinter.print(500));
		assertEquals("  _____     _____ \n |  __ \   / ____|\n | |  | | | |     \n | |  | | | |     \n | || | | |___ \n |/   \|\n", RomanPrinter.print(600));
		assertEquals("  _____     _____    _____ \n |  __ \   / |  / |\n | |  | | | |      | |     \n | |  | | | |      | |     \n | |__| | | |  | | \n |/   \|  \|\n", RomanPrinter.print(700));
		assertEquals("  _____     _____    _____    _____ \n |  __ \   / ____|  / ____|  / ____|\n | |  | | | |      | |      | |     \n | |  | | | |      | |      | |     \n | || | | |__  | |___  | |____ \n |/   \|  \|  \|\n", RomanPrinter.print(800));
		assertEquals("   _____   __  __ \n  / | |  \/  |\n | |      | \  / |\n | |      | |\/| |\n | |  | |  | |\n  \_____| ||  ||\n", RomanPrinter.print(900));
		assertEquals("  __  __ \n |  \/  |\n | \  / |\n | |\/| |\n | |  | |\n ||  ||\n", RomanPrinter.print(1000));
	}
	@Test
	public void testIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
		assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
		assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(-1));
	}
}
