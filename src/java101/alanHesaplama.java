package java101;
import java.util.Scanner;
import java.lang.Math;

public class alanHesaplama {

	public static void main(String[] args) {
		int a,b,c,u,alan;
		Scanner scan= new Scanner(System.in);
		System.out.println("Birinci kenar uzunlugu:");
		a=scan.nextInt();
		System.out.println("İkinci kenar uzunlugu:");
		b=scan.nextInt();
		System.out.println("Ucuncu kenar uzunlugu:");
		c=scan.nextInt();
		u=(a+b+c)/2;
		System.out.println("Alan: "+Math.sqrt(u*(u-a)*(u-b)*(u-c)));
		
		
	}

}
