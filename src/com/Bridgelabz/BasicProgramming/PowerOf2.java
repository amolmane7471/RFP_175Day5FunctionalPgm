package com.Bridgelabz.BasicProgramming;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		int n,i=1,pow=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value For n:");
		n=sc.nextInt();
		sc.close();
		System.out.println("powers of 2 that are less than 2^" +n);
		while(i<=n)
		{
			pow=pow*2;
			System.out.println("2^" +i+ "=" + pow);
		i++;
		}
	}

}
