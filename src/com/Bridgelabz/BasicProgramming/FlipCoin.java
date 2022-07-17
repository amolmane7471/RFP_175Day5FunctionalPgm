package com.Bridgelabz.BasicProgramming;
import java.util.Scanner; 
public class FlipCoin {

	public static void main(String[] args) {
		int n,loopCount=0 ,H_Cnt=0,T_Cnt=0;
		double result,percent_Hcnt,percent_Tcnt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of times flip coin:");
		n=sc.nextInt();
		while(loopCount<n) {
			loopCount++;
		result= Math.random();
		System.out.println(result);
		if(result<0.5) {
			System.out.println("Flipped coin is tails");
			T_Cnt++;
		System.out.println("Tail Count Is:"+T_Cnt);
		}
		else {
			System.out.println("Flipped coin is Heads");
			H_Cnt++;
			System.out.println("Head Count Is:"+H_Cnt);
					}
		}
		sc.close();
		percent_Hcnt=H_Cnt*(100/n);
		System.out.println("Percent of head:"+percent_Hcnt);	
		percent_Tcnt=T_Cnt*(100/n);
		System.out.println("percent of tail:"+percent_Tcnt);	
	
	}
}
