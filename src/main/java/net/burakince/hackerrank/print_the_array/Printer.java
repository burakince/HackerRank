package net.burakince.hackerrank.print_the_array;

public class Printer {

	public void printArray(Object... objects) {
		for (Object o : objects) {
			if (o instanceof Integer) {
				System.out.println((Integer) o);
			} else if (o instanceof String) {
				System.out.println((String) o);
			}
		}
	}

}
