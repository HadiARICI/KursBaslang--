package DayOdev;

import java.util.Scanner;

public class BankaMatik {
    public static void main(String[] args) {

        int bakiye = 500;
        System.out.println("Hosgeldiniz");


        while(true) {

            System.out.println("**********");
            System.out.println("Isleminizi Secin");
            System.out.println("1 Para Yatirma");
            System.out.println("2 Para Cekme  ");
            System.out.println("3 Bakiye Sorma");
            System.out.println("4 Cikis");

            Scanner scan = new Scanner(System.in);
            int islem = scan.nextInt();

            switch(islem)  {
                case 1:
                {
                    Scanner sca = new Scanner(System.in);
                    System.out.println("Yatirilacak Tutari Giriniz");
                    int a = sca.nextInt();
                    bakiye = bakiye+a;
                    System.out.println("Paraniz hesabiniza yatirildi.");
                    System.out.println("Bakiyeniz: "+bakiye);
                    System.out.println("Baska islem yapmak icin E ' ye bas.");
                    System.out.println("Cikis yapmak icin A ' ya bas");
                    System.out.print("Isleminiz: ");

                    Scanner sc = new Scanner(System.in);
                    String aaa = sc.nextLine();
                    switch(aaa) {
                        case "A":
                        {
                            break;
                        }
                        case "E":
                        {
                            continue;
                        }
                    }
                }
                case 2:
                {
                    Scanner sca = new Scanner(System.in);

                    System.out.print("Cekilecek Tutari Gir:");
                    int b = sca.nextInt();
                    if (bakiye < b) {
                        System.out.println("Bakiyeniz yetersiz.");
                        continue;
                    }
                    else {
                        bakiye=bakiye-b;
                        System.out.println("Para cekme islemin basariyla gerceklesti.");
                        System.out.println("Bakiyeniz: "+bakiye);
                        System.out.println("Baska islem yapmak icin E ' ye bas.");
                        System.out.println("Cikis yapmak icin A ' ya bas.");
                        System.out.print("Isleminiz: ");

                        Scanner inp = new Scanner(System.in);
                        String a = inp.nextLine();
                        switch(a) {
                            case "A":
                            {
                                break;
                            }
                            case "E":
                            {
                                continue;
                            }
                        }
                    }}

                case 3:
                {


                    System.out.println("Bakiyeniz: "+bakiye);
                    System.out.println("Baska islem yapmak icin E ' ye bas.");
                    System.out.println("Cikis yapmak icin A ' ya bas.");
                    System.out.print("Isleminiz: ");

                    Scanner i = new Scanner(System.in);
                    String ss = i.nextLine();
                    switch(ss) {
                        case "A":
                        {
                            break;
                        }
                        case "E":
                        {
                            continue;
                        }
                    }
                }
                case 4:
                {
                    System.out.println("Cikis Yapiliyor.");
                    break;
                }
            }


        }
    }

}
