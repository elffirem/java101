package java101;

import java.util.Scanner;

public class basamakToplami {

	public static void main(String[] args) {
		int n,toplam=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		n=scan.nextInt();
		while(n!=0) {
			toplam+=n%10;
			n=n/10;
		}
		System.out.println("Basamak Toplami:" +toplam);
	}

}
