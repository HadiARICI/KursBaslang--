package Day03methodobjectcreationscanner;

import java.util.Scanner;

public class Student {

    public static boolean stdName;
    //variable (==> pasif özellik
    public String name="Ali Can";
    public  byte grade=8;
    public  String adress="Ankara";
    public boolean age;

    public static void staticMethod() {
    }

    public void study(){
        System.out.println("Günlük Tekrarlarını asla ihmal etmez");

            }
    public void feed(){
        System.out.println("sağlıklı beslenir");
    }

    public void nonStaticMethod() {
    }
}
