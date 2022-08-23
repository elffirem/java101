package java101;

import java.util.Scanner;

public class usluSayi {

	public static void main(String[] args) {
		int n,r,carpim=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("n^r icin n:");
		n=scan.nextInt();
		System.out.println("n^r icin r:");
		r=scan.nextInt();
		for(int i=0;i<r;i++) {
			carpim*=n;
		}
		System.out.println(carpim);
	}

}
