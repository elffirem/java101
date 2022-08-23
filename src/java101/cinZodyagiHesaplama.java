package java101;

import java.util.Scanner;

public class cinZodyagiHesaplama {

	public static void main(String[] args) {
		int yil,mod;
		Scanner scan=new Scanner(System.in);
		System.out.println("Dogum yiliniz:");
		yil=scan.nextInt();
		mod=yil%12;
		System.out.println("Cin Zodyagi Burcunuz:"+zodyag(mod));

	}
	private static String zodyag(int mod) {
		switch(mod) {
		case 0:
			return "Maymun";
		case 1: 
			return "Horoz";
		case 2:
			return "Kopek";
		case 3: 
			return "Domuz";
		case 4:
			return "Fare";
		case 5: 
			return "Okuz";
		case 6:
			return "Kaplan";
		case 7: 
			return "Tavsan";
		case 8:
			return "Ejderha";
		case 9: 
			return "Yilan";
		case 10:
			return "At";
		case 11: 
			return "Koyun";
		default:
			return "";
		}
	}

}
