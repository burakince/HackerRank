package net.burakince.hackerrank.codestorm.game_with_a_boomerang;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (0 < test--) {
			Aborigin aborigines = new Aborigin(sc.nextInt());
			while (aborigines.size() > 1) {
				aborigines.throwBoomerang();
			}
			System.out.println(aborigines.lastAborigin());
		}
		sc.close();
	}

}
