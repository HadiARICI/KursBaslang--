package day28interfacecollections;

import day27abstractionday.Security;

public class Civic implements Ac,Engine, Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("AC runs super");
    }
    //Interface

}
