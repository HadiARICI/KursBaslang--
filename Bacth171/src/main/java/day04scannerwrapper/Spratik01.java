package day04scannerwrapper;

import java.util.Scanner;

public class Spratik01 {
    public static void main(String[] args) {

        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5

        Scanner input =new Scanner(System.in);
        System.out.println("lütfen 3 sayi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int sayi3=input.nextInt();

        int ortlama=(sayi1+sayi2+sayi3)/3;

        System.out.println("üç sayinin ortaması: "+ortlama);

    }


}
