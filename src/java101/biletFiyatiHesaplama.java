package java101;

import java.util.Scanner;

public class biletFiyatiHesaplama {

	public static void main(String[] args) {
		int km,yas,tip;
		double normalTutar,indirimliTutar;
		double indirimOrani;
		Scanner scan= new Scanner(System.in);
		System.out.println("Mesafe:");
		km=scan.nextInt();
		System.out.println("Yas:");
		yas=scan.nextInt();
		System.out.println("Yolculuk Tipi: (1-Tek Yon, 2-Gidis-Donus)");
		tip=scan.nextInt();
		if(km>0 && yas>0 &&(tip==1 || tip==2)) {
			normalTutar= km*0.1;
			if(yas<12) {
				indirimOrani=0.5;
			}else if(yas<24) {
				indirimOrani=0.1;
			}else if(yas>65) {
				indirimOrani=0.3;		
			}else {
				indirimOrani=0;
			}
			indirimliTutar=normalTutar-normalTutar*indirimOrani;
			if(tip==2) {
				indirimliTutar=indirimliTutar*0.8*2;
			}
			System.out.println("Odemeniz Gereken Ucret: "+indirimliTutar);
		}else {
			System.out.println("Hatali Veri Girdiniz!");
		}
		
	}
	

}
