package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
// yer değiştirme
        int a=12;
        int b=5;

        int bos=a;

        a=b;
        b=bos;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=a+b;
        a=a-b;

        b=b+a;
        b=b-a;



        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
