public class Sedan extends OtomobilProps{

    private int gunlukUcret = 550;
    private int aylikUcret = 12000;

    public Sedan(String model, int bagajHacmi, String renk, int yil, String yakitTipi) {
        super(model, bagajHacmi, renk, yil, yakitTipi);
    }

    @Override
    public double gunlukKiralamaUcreti(int gun) {
        return gunlukUcret*gun;
    }

    @Override
    public double aylikKiralamaUcreti(int ay) {
        return aylikUcret*ay;
    }

    @Override
    public String getAracKasasi() {
        return "Sedan";
    }
}
