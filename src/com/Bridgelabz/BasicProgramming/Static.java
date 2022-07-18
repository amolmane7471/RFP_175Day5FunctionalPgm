package com.Bridgelabz.BasicProgramming;

public class Static {
	static int a = 5;
	static int b;
	static int c;
	static void staticFunc(int x) {
	System.out.println("x = "+x);
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("c = "+(a+b));
	}
	
    static{
	System.out.println("Static block ");
	b = a + 10;
	}
	public static void main(String args[]) {
		staticFunc(20);
	}
}
