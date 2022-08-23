package java101;
import java.util.Scanner;

public class notOrt {

	public static void main(String[] args) {
		int matematik,fizik,kimya,biyoloji;
		double ort;
		
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Matematik notunuz:");
	matematik= scanner.nextInt();
	
	System.out.println("Fizik notunuz:");
	fizik= scanner.nextInt();
	
	System.out.println("Kimya notunuz:");
	kimya= scanner.nextInt();
	
	System.out.println("Biyoloji notunuz:");
	biyoloji= scanner.nextInt();
	
	ort= (matematik+fizik+biyoloji+kimya)/4;
	System.out.println("Ortalama :" +ort);
	
	System.out.println(ort>=60 ? "Sinifi Gecti " : "Sinifta Kaldı");
	

	}

}
