package BilgisayarBilimleri01;

public abstract class Kurs {
    String dersAdi;
    String ogretmenAdi;
    int dersSaati;
    double kursUcreti;

    public abstract String kategoriAdi();

    @Override
    public String toString() {
        return "Kurs{" +
                "dersAdi='" + dersAdi + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                ", dersSaati=" + dersSaati +
                ", kursUcreti=" + kursUcreti +
                '}';
    }
}
