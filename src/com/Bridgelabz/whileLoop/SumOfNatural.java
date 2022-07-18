package whileLoop;
import java.util.Scanner;
public class SumOfNatural {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		while(num>0)
		{
			sum=sum+num;
			num--;
		}
		System.out.println(sum);
	}

}
