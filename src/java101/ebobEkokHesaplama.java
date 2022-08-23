package java101;

import java.util.Scanner;

public class ebobEkokHesaplama {

	public static void main(String[] args) {
		int n1,n2,ebob=-1;
		int i,flag=0,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayi giriniz:");
		n1=scan.nextInt();
		n2=scan.nextInt();
		i=n1;
		while(flag==0 && i>0) {
			while(i>0 && flag==0) {
				if(n1%i==0) {
					if(n2%i==0) {
						flag=1;
						ebob=i;
					}
				}
				i--;
			}
		}
		System.out.println("EBOB: "+ebob);
		System.out.println("EKOK: "+(n1*n2)/ebob);
	}

}
