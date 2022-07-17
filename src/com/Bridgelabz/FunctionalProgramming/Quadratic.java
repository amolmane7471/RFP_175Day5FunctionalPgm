package com.Bridgelabz.FunctionalProgramming;
import java.util.Scanner;
public class Quadratic {
	
	public double FindDelta(int a, int b, int c) {
		int delta = (b * b) - (4 * a * c);
		return delta;
	}
	public double QuadraticEquation1(int a, int b, double delta) {
	double absDelta = Math.abs(delta);
	double sqrtDelta = Math.sqrt(absDelta);
	double equation1 = (-b + sqrtDelta) / (2 * a);
	return equation1;
	}
	public double QuadraticEquation2(int a, int b, double delta) {
	double absDelta = Math.abs(delta);
	double sqrtDelta = Math.sqrt(absDelta);
	double equation2 = (-b - sqrtDelta) / (2 * a);
	return equation2;
	}
	private static Scanner scanner;
	public static void main(String[] args) {
		Quadratic q=new Quadratic();
		int a, b, c;
		double delta=0;
		
		double equation1,equation2;
		scanner = new Scanner(System.in);
		System.out.println("Enter value for a");
		a=scanner.nextInt();
		System.out.println("Enter value for b");
		b=scanner.nextInt();
		System.out.println("Enter va3lue for c");
		c=scanner.nextInt();
		
		delta=q.FindDelta(a,b,c);
		
		equation1=(double)q.QuadraticEquation1(a,b,delta);
		equation2=(double)q.QuadraticEquation2(a,b,delta);
		
		System.out.println("Root 1 of X is :"+equation1);
		System.out.println("Root 2 of X is :"+equation2);
		
		scanner.close();
	}

}
