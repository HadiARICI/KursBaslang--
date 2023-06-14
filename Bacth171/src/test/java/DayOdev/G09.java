package DayOdev;

public class G09 {
    public static void main(String[] args) {
        int number = 3;

        if(number == 1) {
            System.out.println("One");
        }
        if(number == 2){
            System.out.println("Two");
        }
        if(number == 3){
            System.out.println("Three");
        }
        //cv
        int number1 = 3;
        switch(number1){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
        int number2 = 3;
        switch(number2){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Done");
        }
        int number3 = 3;
        switch(number3){
            case 3:
                System.out.println("hadi");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("Three");
                break;
            default:
                System.out.println("Done");
        }
    }
}
