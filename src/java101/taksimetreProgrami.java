package java101;
import java.util.Scanner;

public class taksimetreProgrami {

	public static void main(String[] args) {
		double fiyat,yol;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Gidilen mesafeyi giriniz:");
		yol=scanner.nextDouble();
		fiyat=10+yol*2.20;
		if(fiyat<20) {
			fiyat=20;
		}
		System.out.println("Odenecek Ucret: "+ fiyat);
		

	}

}
