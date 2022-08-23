package java101;

import java.util.Scanner;

public class tersUcgenYapimi {

	public static void main(String[] args) {
		int n,i,j,k,space;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		n=scan.nextInt();
		
		j=-1;
		space=-1;
		for(i=n/2;i>=0;i--) {
			j++;
			space++;
			while(j>0) {
				System.out.print(" ");
				j--;
			}
			for(k=0;k<(2*i)+1;k++) {
				System.out.print("*");
			}
			while(j<space) {
				System.out.print(" ");
				j++;
			}
			System.out.println("\n");
		}
	}

}
