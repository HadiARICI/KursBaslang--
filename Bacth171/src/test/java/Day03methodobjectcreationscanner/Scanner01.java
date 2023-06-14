package Day03methodobjectcreationscanner;

import java.util.Scanner;

public class Scanner01 {
    /*
    Scanner kullanıcıdan data alıp kodlarımızda kullanmayi sağlar
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yasinizi giriniz");
        int age=input.nextByte();

        System.out.println("age = " + age);


    }



}
