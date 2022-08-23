package java101;
import java.util.Scanner;

public class havaSicakliginaGoreEtkinlik {

	public static void main(String[] args) {
		int heat;
		String[] etkinlikListesi = {"Yuzme","Piknik","Sinema","Masa Tenisi","Kayak"};
		Scanner scan=new Scanner(System.in);
		System.out.println("Hava sicakligini giriniz:");
		heat=scan.nextInt();
		if(heat>25) {
			System.out.println("Onerilen etkinlik: "+ etkinlikListesi[0]);
		}else if(heat>10 && heat<=25) {
			System.out.println("Onerilen etkinlik: "+ etkinlikListesi[1]);
		}else if(heat>5 && heat<=15) {
			System.out.println("Onerilen etkinlik: "+ etkinlikListesi[2]);
		}else if(heat<5 &&heat>0) {
			System.out.println("Onerilen etkinlik: "+ etkinlikListesi[3]);
		}else if(heat<=0) {
			System.out.println("Onerilen etkinlik: "+ etkinlikListesi[4]);
		}
	}

}
