package HayvanatBahcesi01;

public class Kaplumbaga extends Hayvan{
    public Kaplumbaga(String ad, int yas, String tur) {
        super(ad, yas, tur);
    }

    @Override
    public void yemekYer() {
        System.out.println(getYas() + " yaşındaki " + getTur() + " " + getAd() + ", sebze yiyerek karnını doyurur.");
    }

    @Override
    public void sesCikarir() {
        System.out.println(getYas() + " yaşındaki " + getTur() + " " + getAd() + ", vışlayarak ses çıkarır.");
    }
}
