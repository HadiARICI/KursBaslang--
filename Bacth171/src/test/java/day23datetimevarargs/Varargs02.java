package day23datetimevarargs;

public class Varargs02 {
    public static void main(String[] args) {

        System.out.println(add(2,3,4,5,6));
    }

    //Note 1) Bir method parantezinde birden fazla Varargs kullanilamaz
    //Note 2) Eger bir method parantezinde birden fazla parametre kullanilacaksa Varargs sonda olmalidir
    public static int add(int... a) {

        int sum = 0;

        for (int w : a) {
            sum = sum + w;

        }
        return sum;
    }
}
