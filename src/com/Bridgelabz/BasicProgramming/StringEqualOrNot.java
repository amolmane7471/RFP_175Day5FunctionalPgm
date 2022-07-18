package com.Bridgelabz.BasicProgramming;
import java.util.Scanner;
public class StringEqualOrNot {
   
	public static void main(String[] args) {
	String str1,str2;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter String one");
	str1=sc.nextLine();
	System.out.println("Enter String Two");
	str2=sc.nextLine();
  if(str1.equals(str2)) {
		System.out.println("Two Strings Are Equal");
  }
  else
		{
	  System.out.println("Two Strings Are Not Equal");
		}
	}

}
