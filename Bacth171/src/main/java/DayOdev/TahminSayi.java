package DayOdev;

import java.util.Random;
import java.util.Scanner;

public class TahminSayi {
    public static void main(String[] args) {

        Random rnd = new Random();  // random sınıfını bu şekilde oluşturuyoruz.
        Scanner input = new Scanner(System.in);   // Scanner sınıfını kullanarak kullanıcıdan konsol ekranına yazdıklarını alırız
        System.out.println("Tahmin oyunumuza hoşgeldiniz..^\n"        //istenilen menü tasarımı örneği
                + "Toplam 3 tahmin hakkınız vardır\n"
                + "1 seviyesi (1-100 arasında bir sayi giriniz)\n"
                + "");
        System.out.println("Lütfen seviye seçimi yapınız");

        int seviyeSecimi = input.nextInt();
        int can = 3;
        if (seviyeSecimi == 1) {
            int tahminEdilcekSayi = rnd.nextInt(100);
            while (can > 0) {
                System.out.println("Bir tahmin yapınız");
                int kullanıcıTahmin = input.nextInt();
                if (kullanıcıTahmin == tahminEdilcekSayi) {
                    System.out.println("Tebrikler doğru tahmin!! <<" + tahminEdilcekSayi + ">> ");
                    break;
                } else if (kullanıcıTahmin > tahminEdilcekSayi) {
                    System.out.println("Tahmininiz yüksek :) ");
                    can--;
                    System.out.println("Kalan Hakkınız: " + can);
                } else {
                    System.out.println("Tahmininiz küçük :) ");
                    can--;
                    System.out.println("Kalan Hakkınız: " + can);
                }
            }
            if (can == 0)
                System.out.println("Bulmanız gereken sayı : " + tahminEdilcekSayi);
            /*
        } else if (seviyeSecimi == 2) {
            int tahminEdilcekSayi = (int) (Math.random() * 100);
            while (can > 0) {
                System.out.println("Bir tahmin yapınız");
                int kullanıcıTahmin = input.nextInt();
                if (kullanıcıTahmin == tahminEdilcekSayi) {
                    System.out.println("Tebrikler doğru tahmin!! <<" + tahminEdilcekSayi + ">> ");
                    break;
                } else if (kullanıcıTahmin > tahminEdilcekSayi) {
                    System.out.println("Tahmininiz yüksek :) ");
                    can--;
                    System.out.println("Kalan Hakkınız: " + can);
                } else {
                    System.out.println("Tahmininiz küçük :) ");
                    can--;
                    System.out.println("Kalan Hakkınız: " + can);
                }
            }
            if (can == 0)
                System.out.println("bulmanız gereken sayı : " + tahminEdilcekSayi);
        } else if (seviyeSecimi == 3) {
            can = 5;
            System.out.println("Bir tahmin yapınız");
            int tahminEdilcekSayi = (int) (Math.random() * 1000);
            while (can > 0) {

                int kullanıcıTahmin = input.nextInt();
                if (kullanıcıTahmin == tahminEdilcekSayi) {
                    System.out.println("Tebrikler doğru tahmin!! <<" + tahminEdilcekSayi + ">> ");
                    break;
                } else if (kullanıcıTahmin > tahminEdilcekSayi) {
                    System.out.println("Tahmininiz yüksek :) " + can--);
                    can--;
                    System.out.println("Kalan Hakkınız: " + can);
                } else {
                    System.out.println("Tahmininiz küçük :) ");
                    can--;
                    System.out.println("Kalan Hakkınız: " + can);
                }
            }
            if (can == 0)
                System.out.println("Bulmanız gereken sayı : " + tahminEdilcekSayi);
        }

    }

             */
        }
    }
}



