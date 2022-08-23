package java101;
import java.util.Scanner;

public class kdvHesaplama {

	public static void main(String[] args) {
		float kdvsizFiyat,kdvTutari=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Tutar giriniz:");
		kdvsizFiyat=scanner.nextFloat();
		if(kdvsizFiyat>0 && kdvsizFiyat<1000) {
			kdvTutari=(kdvsizFiyat*18)/100;	
		}else if(kdvsizFiyat>=1000) {
			kdvTutari=(kdvsizFiyat*8)/100;			
		}
		
		System.out.println("KDV tutari: "+ kdvTutari);
	}
	

}
