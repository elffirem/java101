package java101;

import java.util.Scanner;

public class ikininKatlari {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi Giriniz:");
		n=scan.nextInt();
		for(int i=1;i<n;i*=4) {
			System.out.println(i);
		}
		for(int i=1;i<n;i*=5) {
			System.out.println(i);
		}

	}

}
