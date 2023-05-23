package DayOdev;

import java.util.Scanner;

public class C01_Sifre {
    public static void main(String[] args) {

        /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz
*/
        // 1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini consolo yazdirrin
        String s = "George Orwell 1984";
        System.out.println(s.replaceAll("[0-9]", "").length());

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki
        // tum karakterleri console a buyuk harflerle yazdirini
        String s1 = "George Orwell";
        System.out.println(s1.substring(0, 1).toLowerCase() + s1.substring(1, s1.length() - 1).toUpperCase()
                + s1.substring(s1.length() - 1).toLowerCase());

        // Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin
        // ASCII degerleri toplamini console a yazdiriniz
        String s2 = "Guzel goren guzel dusunur.";
        char ilkChr = s2.charAt(0);
        char sonChar = s2.charAt(s2.length() - 1);
        System.out.println(ilkChr + sonChar);

        // Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //console a yazdirin
        String city = "mersin";
        String ilk = city.substring(0, 1).toUpperCase();
        String ikinci = city.substring(1).toLowerCase();
        System.out.println(ilk + ikinci);
        System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase());

        //Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        //        a)En az 6 character olsun
        //        b)En az bir tane buyuk harf olsun
        //        c)En az bir tane kucuk harf olsun
        //        d)En az bir tane rakam olsun
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz..");
        String sifre = input.next();

        //        a)En az 6 character olsun
        boolean enAzAltiKarakter = sifre.length() > 5;
        System.out.println("enAzAltiKarakter = " + enAzAltiKarakter);

        // b)En az bir tane buyuk harf olsun
        boolean enAzBirBuyukHarf = sifre.replaceAll("[A-Z]", "").length() > 0;
        System.out.println("enAzBirBuyukHarf = " + enAzBirBuyukHarf);

        //        c)En az bir tane kucuk harf olsun
        boolean enAzBirKucukHarf = sifre.replaceAll("[a-z]", "").length() > 0;
        System.out.println("enAzBirKucukHarf = " + enAzBirKucukHarf);

        //        d)En az bir tane rakam olsun
        boolean enAzBirRakam = sifre.replaceAll("[0-9]", "").length() > 0;
        System.out.println("enAzBirRakam = " + enAzBirRakam);

        if (enAzAltiKarakter && enAzBirBuyukHarf && enAzBirKucukHarf && enAzBirRakam) {
            System.out.println("Isleminiz basariliyla gerceklestirilmistir...");

        }else {
            System.out.println("Isleminiz geçersiz");
        }
            }
}
