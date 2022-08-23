package java101;
import java.util.Scanner;

public class daireDilimiAlani {

	public static void main(String[] args) {
	double r,pi=3.14,a,alan;
	Scanner scan =new Scanner(System.in);
	System.out.println("Yaricapi giriniz:");
	r=scan.nextDouble();
	System.out.println("Aciyi giriniz:");
	a=scan.nextDouble();
	alan=(pi*r*r)*a/360;
	System.out.println("Alan: "+ alan);
	}

}
