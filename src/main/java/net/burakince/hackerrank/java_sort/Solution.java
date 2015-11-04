package net.burakince.hackerrank.java_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {

	private final int id;
	private final String name;
	private final double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Student other) {
		if (cgpa < other.cgpa) {
			return 1;
		} else if (cgpa > other.cgpa) {
			return -1;
		} else {
			int nameCompare = name.compareTo(other.name);
			if (nameCompare < 0) {
				return -1;
			} else if (nameCompare > 0) {
				return 1;
			} else {
				int idCompare = id - other.id;
				return idCompare > 0 ? -1 : idCompare < 0 ? 1 : 0;
			}
		}
	}

}

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());

		final List<Student> students = new ArrayList<Student>();
		while (0 < tests--) {
			int id = sc.nextInt();
			String name = sc.next();
			double cgpa = sc.nextDouble();

			students.add(new Student(id, name, cgpa));
		}
		sc.close();

		Collections.sort(students);

		for (Student st : students) {
			System.out.println(st);
		}
	}

}
