package DayOdev;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {


         /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden kodu yaziniz
        */


        Scanner sc=new Scanner(System.in);
        System.out.println("3 kelimelik isim giriniz");
        String s=sc.nextLine();


      //  s.indexOf("0");

        String s1= s.substring(0,1);
        String s2=s.substring(4,5);
        String s3= s.substring(9,10);
        System.out.println(s1+"."+s2+"."+s3+".");
    }
}
