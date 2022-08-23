package java101;
import java.util.Scanner;

public class asalSayilariBulma {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int flag;
		for(int i=2;i<=100;i++) {
			flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(" "+i);
			}
		}

	}

}
