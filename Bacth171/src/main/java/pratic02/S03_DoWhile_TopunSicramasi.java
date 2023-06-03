package pratic02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S03_DoWhile_TopunSicramasi {
    /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 ü kadar yerden yukarı doğru zıplamaktadır.
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        double yukseklik = input.nextDouble();

        double toplamYol = 0;
        int yereVurmaSayisi = 0;

        do {
            yereVurmaSayisi++;
            toplamYol += yukseklik;
            yukseklik *= 0.75;
            toplamYol += yukseklik;
        } while (yukseklik > 1);
        toplamYol += yukseklik;
        yereVurmaSayisi++;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Toplam yol: " + df.format(toplamYol));
        System.out.println("Yere Vurma Sayısı: " + yereVurmaSayisi);
    }
}

        /*
            Amaç:
            Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
            Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı tanınır.

            Yönergeler:
            - Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
            - Oyuncu bir sayı girişi yapar.
            - Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
                - Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
                  Ardından oyuncunun puanı hesaplanır ve "Puanınız: X" mesajı gösterilir ve
                  "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
                - Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:" mesajı gösterilir.
                - Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:" mesajı gösterilir.
                - Oyuncuya 10 tahmin hakkı verilir. Oyuncu 10 tahmin hakkını da kullanırsa,
                  "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
                  mesajı gösterilir.
                - Oyuncu 1'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
                - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.
         */

