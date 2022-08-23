package java101;
import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = input.nextLine();
            System.out.print("Parolaniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hoşgeldiniz!");
                
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Cıkıs Yap");
                    System.out.print("Lütfen yapmak istediginiz islemi seciniz : ");
                    select = input.nextInt();
                    switch(select) {
                    case 1:
                    	System.out.print("Para miktari : ");
                         price = input.nextInt();
                        balance += price;
                    case 2:
                    	   System.out.print("Para miktari : ");
                            price = input.nextInt();
                           if (price > balance) {
                               System.out.println("Bakiye yetersiz.");
                           } else {
                               balance -= price;
                           }
                    case 3:
                    	System.out.println("Bakiyeniz : " + balance);
                    case 4:
                    	 System.out.println("Bakiyeniz : " + balance);
                    }}
           
        }
    }}
