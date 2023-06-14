package pratic01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {
    /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2 pisagor bağlantısından yararlanabilirsiniz)
    */
    public static void main(String[] args) {
        // Ödev-1: Soruyu If Statement kullanarak çözünüz.

        dikucgeMethod();
           
            }

    // Ödev-2: Dik üçgen hesaplamasını yapan bir metot oluşturun ve kullanın.
    public static void dikucgeMethod() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 3 sayi giriniz \nSayi1: \nSayi2: \nSayi3: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int dik1 = a*a;
        int dik2 = b*b;
        int dik3 = c*c;

        if (dik1+dik2==dik3){
            System.out.println("Dik Üçgen dir");
        }else {
            System.out.println("diküçgen değildir");
        }

    }



}

