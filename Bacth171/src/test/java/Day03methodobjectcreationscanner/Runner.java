package Day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        // obje oluşturmak için
        // constructor javada objeleri oluşturmak için kullanılan özel bir methodtur..
        // önce Clas ismi + Obje İsmi +Assigment Oparatör+ new keyword+constructor

        Car myCar=new Car();
        System.out.println("myCar Fiyatı:"+myCar.fiyat);
        System.out.println("myCarModel:"+myCar.model);

        myCar.dur();
        myCar.hareket();
        System.out.println(" ==========  ");
        Student aliCan=new Student();
       ;
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        aliCan.study();
        aliCan.feed();


        //homework
//icinde isim ve yas varibale lari ile teach methodu bulunan
// bir Teacher objecti olusturun ve obje uzerinde bu ozellikleri kullanini

    }
}
