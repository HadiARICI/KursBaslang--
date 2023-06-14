package Day03methodobjectcreationscanner;

import java.util.Scanner;

public class C01_Pratik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen dairenin yari çapını giriniz");
        double yariCap = input.nextDouble();
        double pi = 3.14;


        System.out.println("cemberCevreHesaplama(yariCap, pi) = " + cemberCevreHesaplama(yariCap, pi));
        System.out.println("daireAlanHesaplama(yariCap, pi) = " + daireAlanHesaplama(yariCap, pi));


    }

    public static double daireAlanHesaplama(double yariCap, double pi) {
        double daireAlan = yariCap * yariCap * pi;
        return daireAlan;

}

    public static double cemberCevreHesaplama(double yariCap, double pi  ) {
        double cevreHesaplama=2*yariCap*pi;
        return cevreHesaplama;
    }

}

