package forLoop;
import java.util.Scanner;
public class Palindrome {
		public static void main(String[] args) {
			int num,num2,remainder,reverse=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			num=sc.nextInt();
			num2=num;
			sc.close();
			for(;num!=0;num=num/10)
			{
				remainder=num%10;
				reverse=reverse*10+remainder;
			
			}
			System.out.println("Reverse of a num is:"+reverse);
		if(reverse==num2)
		{
			System.out.println(+num2+" is a Palindrome Number");
		}
		else
			System.out.println(+num2+" is not a Palindrome Number");
	}
}

