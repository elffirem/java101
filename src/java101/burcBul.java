package java101;
import java.util.Scanner;
public class burcBul {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ay: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();
        if(month==1) {
            if (day >= 1 && day<= 31){
                if (day >= 1 && day <= 21) {
                    System.out.print("Burcunuz: Oglak");
                } else {
                    System.out.print("Burcunuz: Kova");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month == 2) {
            if(day>=1 && day<=28) {
                if (day >= 1 && day <= 19) {
                    System.out.print("Burcunuz: Kova");
                } else {
                    System.out.print("Burcunuz: Balık");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if (month == 3) {
            if(day>=1 && day <=31) {
                if (day >= 1 && day <= 20) {
                    System.out.print("Burcunuz: Balık");
                } else {
                    System.out.print("Burcunuz: Koç");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month ==4){
            if(day>=1 && day<=30) {
                if (day >= 1 && day <= 20) {
                    System.out.print("Burcunuz: Koç");
                } else {
                    System.out.print("Burcunuz: Boga");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month ==5){
            if(day>=1 && day <=31) {
                if (day >= 1 && day <= 21) {
                    System.out.print("Burcunuz: Boga");
                } else {
                    System.out.print("Burcunuz: İkizler");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month ==6 ){
            if(day>=1 && day<=30) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz İkizler");
                } else {
                    System.out.print("Burcunuz: Yengeç");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month==7){
            if(day>=1 && day<=31) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz: Yengeç");
                } else {
                    System.out.print("Burcunuz: Aslan");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month==8){
            if(day>=1 && day<=31) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz: Aslan");
                } else {
                    System.out.print("Burcunuz: Başak");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month ==9){
            if(day>=1 && day<=30 ) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz: Başak");
                } else {
                    System.out.print("Burcunuz: Terazi");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month==10){
            if(day>=1 && day<=31 ) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz: Terazi");
                } else {
                    System.out.print("Burcunuz: Akrep");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month==11){
            if(day>=1 && day<=30) {
                if (day >= 1 && day <= 21) {
                    System.out.print("Burcunuz: Akrep");
                } else {
                    System.out.print("Burcunuz: Yay");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
        }
        if(month==12){
            if(day>=1 && day <=31) {
                if (day >= 1 && day <= 21) {
                    System.out.print("Burcunuz: Yay");
                } else {
                    System.out.print("Burcunuz: Oglak");
                }
            }else{
                System.out.print("Lutfen Geçerli Bir Tarih Giriniz");
            }
           }
          }
        }































