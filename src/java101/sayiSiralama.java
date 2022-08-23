package java101;

import java.util.Scanner;

public class sayiSiralama {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan= new Scanner(System.in);
		System.out.println("Siralamak istediginiz 3 sayiyi giriniz: ");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		System.out.println("a:"+a+"\nb:"+b+"\nc:"+c);
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("c<b<a");
			}else {
				System.out.println("b<c<a");
			}
		}else if(b>c && b>a) {
			if(a>c) {
				System.out.println("c<a<b");
			}else {
				System.out.println("a<c<b");
			}
			
		}else {
			if(a>b) {
				System.out.println("b<a<c");
			}else {
				System.out.println("a<b<c");
			}
		}
		
	}

}
