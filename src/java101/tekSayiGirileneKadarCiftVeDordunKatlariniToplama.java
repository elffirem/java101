package java101;

import java.util.Scanner;

public class tekSayiGirileneKadarCiftVeDordunKatlariniToplama {

	public static void main(String[] args) {
		int n=0,toplam=0;
		Scanner scan=new Scanner(System.in);
		while(n%2!=1) {
			System.out.println("Sayi giriniz: ");
			n=scan.nextInt();
			if(n%4==0) {
				toplam+=n;
			}
		}
		System.out.println("Toplam:"+ toplam);
	}

}
