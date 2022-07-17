package com.Bridgelabz.FunctionalProgramming;

import java.util.Scanner;

public class Distance {
	public double EuclideanDistance(int x1, int y1, int x2, int y2) {
		double distance;
		int x, y;
		x = x2 - x1;
		y = y2 - y1;
		
		distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		return distance;
	}
	public static void main(String[] args) {

	Distance dist = new Distance();

		int x1 = 0, y1 = 0;
		int x2, y2;
		double distance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the value of x2");
		x2 = scanner.nextInt();
		System.out.println("Please enter the value of y2");
		y2 = scanner.nextInt();

		distance = dist.EuclideanDistance(x1, y1, x2, y2);

		System.out.println("Euclidean Distance of x and y from origin is: " + distance);
		scanner.close();
	}

}