public abstract class OtomobilProps implements IOtomobil{

    private String model;
    private int bagajHacmi;
    private String renk;
    private int yil;
    private String yakitTipi;

    public OtomobilProps(String model, int bagajHacmi, String renk, int yil, String yakitTipi) {
        this.model = model;
        this.bagajHacmi = bagajHacmi;
        this.renk = renk;
        this.yil = yil;
        this.yakitTipi = yakitTipi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBagajHacmi() {
        return bagajHacmi;
    }

    public void setBagajHacmi(int bagajHacmi) {
        this.bagajHacmi = bagajHacmi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

}
