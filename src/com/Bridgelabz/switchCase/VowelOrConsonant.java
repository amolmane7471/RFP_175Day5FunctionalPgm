package switchCase;
import java.util.Scanner;
public class VowelOrConsonant {
	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
        ch=sc.next().charAt(0);
        sc.close();
        switch(ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
   	             System.out.println("Character you have Entered is Vowel");
   	             break;
        default:
        	System.out.println("Character you have Entered is Consonant");
        }
	}

}
