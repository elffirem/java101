package java1011;

import java.util.Arrays;
import java.util.Scanner;

public class harmonikOrtalamaBulma {

	public static void main(String[] args) {
	int n;
	double harmonikSeri = 0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Kac adet sayi gireceksiniz?");
	n=scan.nextInt();
	int[] numbers=new int[n];
	for(int i=0;i<n;i++) {
		numbers[i]=scan.nextInt();
	}
	for(int i=0;i<n;i++) {
		harmonikSeri+=(1.0/(i+1));
	}
	System.out.println("Harmonik Ortalama:"+(double)n/harmonikSeri);
	}

}
