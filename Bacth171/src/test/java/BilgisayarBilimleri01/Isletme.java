package BilgisayarBilimleri01;

public class Isletme extends Kurs{

    @Override
    public String kategoriAdi() {
        return "İşletme";
    }

    @Override
    public String toString() {
        return "İsletme{" +
                "dersAdi='" + dersAdi + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                ", dersSaati=" + dersSaati +
                ", kursUcreti=" + kursUcreti +
                '}';
    }
}
