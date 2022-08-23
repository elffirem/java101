package java101;
import java.util.Scanner;

public class fibonacciSerisi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,preNumber=1,currNumber=1,newNumber;
		System.out.println("Fibonacci Serisinin Eleman Sayisini Giriniz: ");
		n=scan.nextInt();
		System.out.println("1\n1");
		for(int i=1;i<n-1;i++) {
			newNumber=preNumber+currNumber;
			preNumber=currNumber;
			currNumber=newNumber;			
			System.out.println(newNumber);
		}
	}

}
