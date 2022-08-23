package java101;
import java.util.Scanner;

public class sinifGecmeDurumu {
	static int dersSayisi = 0;

	public static void main(String[] args) {
		double matematik,turkce,fizik,kimya,muzik,toplam=0;
		double ort;
		Scanner scan=new Scanner(System.in);
		System.out.println("Matematik notunuzu giriniz:");
		matematik=scan.nextInt();
		toplam+=kontrol(matematik);
		System.out.println("Turkce notunuzu giriniz:");
		turkce=scan.nextInt();
		toplam+=kontrol(turkce);
		System.out.println("Fizik notunuzu giriniz:");
		fizik=scan.nextInt();
		toplam+=kontrol(fizik);
		System.out.println("Kimya notunuzu giriniz:");
		kimya=scan.nextInt();
		toplam+=kontrol(kimya);
		System.out.println("Muzik notunuzu giriniz:");
		muzik=scan.nextInt();
		toplam+=kontrol(muzik);

		 ort=toplam/dersSayisi;
		 System.out.println("Otalamaniz : "+ort);
		 if(ort>=55) {
			 System.out.println("Sinifi Gectiniz, Tebrikler!");
		 }else {
			 System.out.println("Sinifta Kaldiniz, Seneye Gorusmek Uzere!");
		 }
		

	}

	private static double kontrol(double ders) {
		if (ders<0 || ders>100) {
			return 0;
		}else {
			dersSayisi++;
			return ders;
		}
		
	}
	

}
