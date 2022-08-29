package java101;

import java.util.Scanner;

public class palindromSayiBulma {
	
	static boolean isPalindrom(int number) {
		String numb=Integer.toString(number);
		int i=0;
		while(i<=numb.length()/2 && numb.charAt(i)==numb.charAt(numb.length()-i-1)) {
			i++;			
		}
		if(i>=numb.length()/2) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		n=scan.nextInt();
		System.out.println(isPalindrom(n));
	}

}
