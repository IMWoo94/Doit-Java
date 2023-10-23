package org.example;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		int[][] a = {{1, 2, 3}, {5, 6, 7}};
		int[][] b = a.clone();

		b[0][1] = 999;

		for (int[] ints : b) {
			for (int anInt : ints) {
				System.out.println("anInt = " + anInt);
			}
		}

		System.out.println("===========");
		for (int[] ints : a) {
			for (int anInt : ints) {
				System.out.println("anInt = " + anInt);
			}
		}
	}
}