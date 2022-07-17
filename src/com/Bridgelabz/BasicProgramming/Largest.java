package com.Bridgelabz.BasicProgramming;
import java.util.Scanner;
public class Largest {

    public static void main(String[] args) {
    	int	 n1 , n2 , n3;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter three numbers:");
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      sc.close();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}