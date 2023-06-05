package DayOdev;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1-100 arasında bir sayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println("Lütfen Tahmini bir sayi Giriniz");
        int tahmSayi=scan.nextInt();

       do {


        }while (girilenSayi==tahmSayi);

            if (girilenSayi<tahmSayi){
                System.out.println("büyük rakam giriniz");

            } else if (girilenSayi>tahmSayi) {
                System.out.println("küçük sayi giriniz");

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
}
