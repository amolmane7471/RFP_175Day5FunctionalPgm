package operatorProgram;
import java.util.Scanner;
public class Quadratic {
	  public static void main(String[] Strings) {
		  double a,b,c,x1,x2;
		  Scanner sc = new Scanner(System.in);
                 System.out.print("Input For a: ");
	             a = sc.nextDouble();
	            System.out.print("Input For b: ");
	             b = sc.nextDouble();
	            System.out.print("Input For c: ");
	             c = sc.nextDouble();
	             double delta = b * b - 4.0 * a * c;
                if (delta > 0.0) {
	                 x1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
	                 x2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
	                System.out.println("The roots are " + x1 + " & " + x2);
	            } else if (delta == 0.0) {
	                 x1 = -b / (2.0 * a);
	                System.out.println("The root is " + x1);
	            } else {
	                System.out.println("The equation has no real roots.");
	            }

	    }

	 

}
