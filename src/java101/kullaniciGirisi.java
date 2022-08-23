package java101;
import java.util.Scanner;

public class kullaniciGirisi {

	public static void main(String[] args) {
		int answer;
		String userName,password,newPassword,truePassword="12345",trash;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Kullanici Adi:");
		userName= scan.nextLine();
		System.out.println("Sifre");
		password=scan.nextLine();
		
		if(password.equals(truePassword)) {
			System.out.println("Basariyla Giris Yaptiniz!");
		}else {
			System.out.println("Sifreniz hatali, degistirmek ister misiniz? (1-Evet, 2-Hayir)");
			answer=scan.nextInt();
			if(answer==1) {
				trash=scan.nextLine();
				System.out.println("Yeni Sifre:");
				newPassword=scan.nextLine();
				while(newPassword.equals(truePassword)) {
					System.out.println("Sifre olusturulamadi, lutfen baska bir sifre giriniz");
					newPassword=scan.nextLine();
				}
				truePassword=newPassword;
				System.out.println("Sifre basariyla olusturuldu");
				
			}
		}
		
		
		

	}

}
