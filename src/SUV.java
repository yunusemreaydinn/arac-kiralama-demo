public class SUV extends OtomobilProps{

    private int ucret = 600;
    private double katsayi;

    public SUV(String model, int bagajHacmi, String renk, int yil, String yakitTipi, double katsayi) {
        super(model, bagajHacmi, renk, yil, yakitTipi);
        this.katsayi = katsayi;
    }


    @Override
    public double gunlukKiralamaUcreti(int gun) {
        return ucret * katsayi * gun;
    }

    @Override
    public double aylikKiralamaUcreti(int ay) {
        System.out.println("SUV araçlar için aylık kiralama mümkün değil.");
        return 0;
    }

    @Override
    public String getAracKasasi() {
        return "SUV";
    }
}
