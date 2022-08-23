package java101;

import java.util.Scanner;

public class artikYilHesaplama {

	public static void main(String[] args) {
		int yil;
		Scanner scan=new Scanner(System.in);
		System.out.println("Yil Giriniz: ");
		yil=scan.nextInt();
		if(hesaplama(yil)) {
			System.out.println(yil + " bir artik yildir!");
		}else {
			System.out.println(yil+" bir artik yil degildir!");
		}

	}
	static boolean hesaplama(int yil) {
		if(yil%100==0) {
			if(yil%400==0) {
				return true;
			}else {
				return false;
			}
		}else if(yil%4==0) {
			return true;
		}else {
		return false;
		}
	}

}
