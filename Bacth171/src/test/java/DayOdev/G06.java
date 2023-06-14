package DayOdev;

public class G06 {
    public static void main(String[] args) {

         int  a=33;
        String result = (a % 2 != 0 && a > 29) ? ("Good") : ("Bad");
        System.out.println(result);//Good

        int  a1=29;
        String result1 = (a1 % 2 != 0 && a1 > 29) ? ("Good") : ("Bad");
        System.out.println(result1);//Bad

        int  a2=12;
        String result2 = (a2 % 2 != 0 && a2 > 29) ? ("Good") : ("Bad");
        System.out.println(result2);//Bad

        int  a3=44;
        String result3 = (a3 % 2 != 0 && a3 > 29) ? ("Good") : ("Bad");
        System.out.println(result3);//Bad

        // CVP:ABC
    }
}
