package HayvanatBahcesi01;

public class Aslan extends Hayvan{

    public Aslan(String ad, int yas, String tur) {
        super(ad, yas, tur);
    }

    @Override
    public void yemekYer() {
        System.out.println(getYas() + " yaşındaki " + getTur() + " " + getAd() + ", et yiyerek karnını doyurur.");
    }

    @Override
    public void sesCikarir() {
        System.out.println(getYas() + " yaşındaki " + getTur() + " " + getAd() + ", kükreyerek ses çıkarır.");
    }

}
