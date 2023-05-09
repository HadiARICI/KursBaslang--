package day04scannerwrapper;

import java.util.Scanner;

public class Spratik02 {

    public static void main(String[] args) {
        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir sayi giriniz");

        int sayi=input.nextInt();

        int birlerBasamagı=sayi%10;
        sayi=sayi/10;

        int onlarBasamagı=sayi%10;
        sayi=sayi/10;

        int yuzlerBasamagı=sayi%10;

        int rakamlarınToplamı=birlerBasamagı+onlarBasamagı+yuzlerBasamagı;

        System.out.println("üç basamaklı sayının rakamları toplamı: "+rakamlarınToplamı);


    }
}
