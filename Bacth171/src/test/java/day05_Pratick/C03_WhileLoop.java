package day05_Pratick;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {


    // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
    // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
    //or: 5!=1*2*3*4*5

    Scanner scan=new Scanner(System.in);
        System.out.println("lütfren bir sayi giriniz");
        int sayi=scan.nextInt();

        int baslagıc=1;
        int carpım=1;

        while (baslagıc<=sayi){
            carpım=carpım*baslagıc;
            baslagıc++;

        }
        System.out.println(sayi+"! "+carpım);
}
}
