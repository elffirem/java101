package java101;
import java.util.Scanner;

public class mukemmelSayiBulma {

	public static void main(String[] args) {
			int n,toplam=0;
			Scanner scan= new Scanner(System.in);
			System.out.println("Bir sayi giriniz: ");
			n=scan.nextInt();
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				toplam+=i;
			}
		}
		if(toplam==n) {
			System.out.println(n +" mukemmel sayidir");
		}else {
			System.out.println(n+ " mukemmel sayi degildir");
		}		
	}

}
