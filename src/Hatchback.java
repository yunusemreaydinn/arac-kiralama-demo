public class Hatchback extends OtomobilProps{

    private int gunlukUcret = 500;
    private int aylikUcret = 13000;

    public Hatchback(String model, int bagajHacmi, String renk, int yil, String yakitTipi) {
        super(model, bagajHacmi, renk, yil, yakitTipi);
    }

    @Override
    public double gunlukKiralamaUcreti(int gun) {
        return gun * gunlukUcret;
    }

    @Override
    public double aylikKiralamaUcreti(int ay) {
        return aylikUcret * ay;
    }

    @Override
    public String getAracKasasi() {
        return "Hatchback";
    }
}
