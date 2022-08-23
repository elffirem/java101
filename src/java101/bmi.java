package java101;
import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		float boy,kilo,bmi;
		Scanner scan= new Scanner(System.in);
		System.out.println("Boyunuzu giriniz: ");
		boy=scan.nextFloat();
		System.out.println("Kilonuzu giriniz: ");
		kilo=scan.nextFloat();
		bmi=kilo/(boy*boy);
		System.out.println("Vucut Kutle Indexiniz: "+bmi);
		
		

	}

}
