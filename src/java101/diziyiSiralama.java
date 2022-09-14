package java1011;

import java.util.Arrays;
import java.util.Scanner;

public class diziyiSiralama {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac adet sayi gireceksiniz?");
		n=scan.nextInt();
		int[] numbers=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+". eleman: ");
			numbers[i]=scan.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}

}
