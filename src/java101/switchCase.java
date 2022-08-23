package java101;
import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		int number;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number:");
		number=scanner.nextInt();
		switch(number) {
		case 6:
			System.out.println("Alti");
		break;
		case 7:
			System.out.println("Yedi");
		default:
			System.out.println("That's it!");
		}
		
		
	}
	
	
}
