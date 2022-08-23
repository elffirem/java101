package java101;

import java.util.Scanner;

public class kombinasyonHesaplama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c,n,r;
		System.out.println("n:");
		n=scan.nextInt();
		System.out.println("r:");
		r=scan.nextInt();
		a=faktoriyel(n);
		b=faktoriyel(r);
		c=faktoriyel(n-r);
		System.out.println(a/(b*c));
	}
	private static int faktoriyel(int n) {
		int carpim=1;
		for(int i=1;i<=n;i++) {
			carpim*=i;
		}
		return carpim;
	}

}
