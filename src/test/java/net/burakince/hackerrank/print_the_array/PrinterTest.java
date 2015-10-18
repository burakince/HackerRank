package net.burakince.hackerrank.print_the_array;

import static org.junit.Assert.*;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class PrinterTest extends HacerRankTestCase {

	@Test
	public void whenGiveIntegerValuesShouldPrintThem() throws Exception {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String expected = "1\n2\n3\n";

		myPrinter.printArray(intArray);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenGiveStringValuesShouldPrintThem() throws Exception {
		Printer myPrinter = new Printer();
		String[] stringArray = {"Hello","World"};
		String expected = "Hello\nWorld\n";

		myPrinter.printArray(stringArray);

		assertEquals(expected, outContent.toString());
	}

}
