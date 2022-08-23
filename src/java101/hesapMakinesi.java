package java101;
import java.util.Scanner;

public class hesapMakinesi {
	public static void main(String[] args) {
		int n1,n2,select;
		Scanner scan= new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz:");
		n1=scan.nextInt();		
		System.out.println("Ikinci sayiyi giriniz:");
		n2=scan.nextInt();
		System.out.println("Yapmak istediginiz islemi seciniz :");
		System.out.println("1-Toplama\n2-Carpma\n3-Cikarma\n4-Bolme");
		select=scan.nextInt();
		
		switch(select) {
		case 1:
			System.out.println(n1+n2);
		break;
		case 2:
			System.out.println(n1*n2);
		break;
		case 3:
			System.out.println(n1-n2);
		break;
		case 4:
			System.out.println(n1/n2);
		break;
		}
		
		
	}

}
