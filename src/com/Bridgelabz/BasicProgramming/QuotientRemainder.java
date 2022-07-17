package com.Bridgelabz.BasicProgramming;
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		int divident,divisor,quotient,remainder;
		System.out.println("Enter Values For divident and divisor");
		Scanner sc=new Scanner(System.in);
           divident=sc.nextInt();
           divisor=sc.nextInt();
           sc.close();
           quotient=divident/divisor;
           remainder=divident%divisor;
           System.out.println("Quotient is:"+quotient);
           System.out.println("Remainder is:"+remainder);
	}

}
