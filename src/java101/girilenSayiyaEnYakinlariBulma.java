package java1011;

import java.util.Scanner;

public class girilenSayiyaEnYakinlariBulma {

	public static void main(String[] args) {
		int n,forLess=100,forMore=100,lsIndex=0,mrIndex=0;
		int[] numbers= {12,16,47,85,34,22};
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz: ");
		n=scan.nextInt();
		for(int i=0;i<numbers.length;i++) {
			if(n>numbers[i]) {
				if((n-numbers[i])<forLess) {
					forLess=n-numbers[i];
					lsIndex=i;
				}
			}else if(n<numbers[i]) {
				if((numbers[i]-n)<forMore) {
					forMore=numbers[i]-n;
					mrIndex=i;
				}
			}
		}
		System.out.println("Girilen Sayi: "+ n);
		System.out.println("Girilen sayidan kucuk en yakin sayi : "+numbers[lsIndex]);
		System.out.println("Girilen sayidan buyuk en yakin sayi : "+numbers[mrIndex]);
		
	}

}
