package com.Bridgelabz.BasicProgramming;

import java.util.Scanner;
public class HarmonicNum {

	public static void main(String[] args) {
		double n,sum=0.0;
		Scanner sc =new Scanner(System.in);
	System.out.println("enter value for n:");
	     n=sc.nextInt();
	     sc.close();
	     for(int i=1;i<=n;i++)
	     {
	    	 
	    	 sum+=1.0/i;
	    	
	     }
	     System.out.println("Nth Harmonic Num:"+sum);
	}

}
