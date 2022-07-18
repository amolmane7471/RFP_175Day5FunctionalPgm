package whileLoop;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int num,remainder,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		while(num>0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse of a num is:"+reverse);
	
	}

}
