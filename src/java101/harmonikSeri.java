package java101;

import java.util.Scanner;

public class harmonikSeri {

	public static void main(String[] args) {
		int n;
		double toplam=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		n=scan.nextInt();
		for(double i=1;i<=n;i++) {
			toplam+=1/i;
			System.out.println("1/"+i);
		}
		System.out.println(toplam);

	}

}
