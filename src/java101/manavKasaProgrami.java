package java101;
import java.util.Scanner;

public class manavKasaProgrami {

	public static void main(String[] args) {
	float kg,fiyat=0;
	Scanner scan= new Scanner(System.in);
	String[] meyveler = {"Armut","Elma","Domates","Muz","Patlican"};
	float[] fiyatlar= {(float) 2.14,(float) 3.67,(float) 1.11,(float) 0.95,(float) 5.00};
	for(int i=0;i<meyveler.length;i++) {
		System.out.println(meyveler[i] +" kac kilo?");
		kg=scan.nextFloat();
		fiyat+=kg*fiyatlar[i];
	}
	System.out.println("Toplam Tutar: "+fiyat);

}

}
