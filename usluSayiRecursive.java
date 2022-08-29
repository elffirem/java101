package java101;

import java.util.Scanner;

public class usluSayiRecursive {

	static int usHesaplama(int t,int u) {
		if(u==0) 
			return 1;
		
		return usHesaplama(t,u-1)*t;
		
	}
	public static void main(String[] args) {
		int t,u;
		Scanner scan=new Scanner(System.in);
		System.out.println("us ve taban sayi giriniz:");
		t=scan.nextInt();
		u=scan.nextInt();
		System.out.println(usHesaplama(t,u));
		

	}

}
