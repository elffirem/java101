package java101;
import java.util.Scanner;

public class minMaxSayiBulma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,sayi,max=-1,min=10000;
		System.out.println("Kac adet sayi gireceksiniz?");
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i+". sayiyi giriniz:");
			sayi=scan.nextInt();
			if(sayi<min) {
				min=sayi;
			}else if(sayi>max) {
				max=sayi;
			}
		}
		System.out.println("En buyuk sayi :"+max );
		System.out.println("En kucuk sayi :"+min );
		

	}

}
