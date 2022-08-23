package java101;

import java.util.Scanner;

public class ucVeDordunKatlariniBulma {

	public static void main(String[] args) {
		double n,toplam=0,toplamSayi=-1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz:");
		n=scan.nextDouble();
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%4==0) {
				toplam+=i;
				toplamSayi++;
				System.out.println("Toplam Sayi: "+toplamSayi);
			}
		}
		System.out.println("Toplam: "+toplam);
		
		System.out.println("3'e ve 4'e bolunen sayilarin ortalamasi: "+ (double)toplam/toplamSayi);



	}

}
