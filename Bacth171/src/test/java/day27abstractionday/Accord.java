package day27abstractionday;

public class Accord implements Ac,Engine,Security {


    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }
}