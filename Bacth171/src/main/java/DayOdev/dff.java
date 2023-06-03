package DayOdev;

public class dff {
    public static void main(String[] args) {


        String str1 = "Ayhan Beyhan";
        System.out.println(str1.replace("han", "ol"));

        String b = "Ali 12 ?_";
        System.out.println("k" + b.replaceAll("\\W", "*"));
        System.out.println("b" + b.replaceAll("\\w", "*"));

        String str = "Canan Can";

        System.out.println(str.startsWith("c"));
        System.out.println(str.endsWith("n"));
        System.out.println(str.startsWith("a", 3));
        System.out.println(str.endsWith("Can"));

        String str2 = "Java code yaz";
        System.out.println(str2.substring(5));
        System.out.println(str2.substring(12));
        System.out.println(str.substring(5, 9));
        System.out.println(str.substring(8, 8));

        String text = "Can, Cananlara gitmek için can atıyor";
        System.out.println(text.replace("Can", "Türk"));

        String str3 = "Ayhan BEYHAN";
        str.replace(str3.substring(0), "AYHAN beyhan");

        String s = "Java is Java";
        System.out.println("---"+s.toUpperCase().lastIndexOf("V"));


        for(int i=1; i<10; i+=2){
            System.out.println(i);
        }
        for(int i=1; i<10; i=i+2){
            System.out.println(i);
        }
        for(int i=9; i>=1; i-=2){
            System.out.println(i);
        }
        for(int i=1; i<=9; i++){
            System.out.println(i);
            i++;
        }
    }
}
