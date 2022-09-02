package java1011;

import java.util.Scanner;

public class sayiyaGoreDesenOlusturma {

	public static void main(String[] args) {
		int n,m;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi:");
		n=scan.nextInt();
		m=n;
		while(m>0) {
			System.out.print(m+" ");
			m-=5;			
		}
		while(m<=n) {
			System.out.print(m+" ");
			m+=5;
		}

	}

}
