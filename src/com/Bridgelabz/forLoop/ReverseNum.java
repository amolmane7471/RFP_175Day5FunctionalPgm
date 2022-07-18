package forLoop;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int num,remainder,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		for(;num!=0;num=num/10)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
		
		}
		System.out.println("Reverse of a num is:"+reverse);
	
	}

}
