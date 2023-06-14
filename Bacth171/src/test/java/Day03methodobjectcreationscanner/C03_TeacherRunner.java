package Day03methodobjectcreationscanner;

public class C03_TeacherRunner {
    public static void main(String[] args) {
        C02_Teacher teacher =new C02_Teacher();
        System.out.println("teacher.age = " + teacher.age);
        System.out.println("teacher.name = " + teacher.name);
        System.out.println("teacher.BaslamaYili = " + teacher.BaslamaYili);
        teacher.harektli();
        teacher.tercubeli();
    }
}
