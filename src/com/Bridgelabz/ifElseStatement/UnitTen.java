package ifElseStatement;
import java.util.Scanner;
public class UnitTen {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter any number from 1,10,100,1000");
		n=sc.nextInt();
	sc.close();
	if(n==1)
	{
		System.out.println("Unit");
	}
		else if (n==10)
		{
			System.out.println("Tens");
	     }
		else if(n==100)
		{
			System.out.println("Hundreds");
		}
		else if(n==1000)
		{
			System.out.println("Thousands");
		}
		
	}

}
