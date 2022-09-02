package java1011;

import java.util.Scanner;

public class asalSayiBulma {

	public static void main(String[] args) {
		int n,i=2,flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi:");
		n=scan.nextInt();
		while(i*i<n && flag==0) {
			if(n%i==0) {
				flag=1;
			}else {
				
			}
			i++;
		}
		if(flag==1) {
			System.out.println(n+" bir asal sayi degildir!");
		}else {
			System.out.println(n+" bir asay sayidir!");
		}
		

	}

}
