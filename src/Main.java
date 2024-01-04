import java.util.List;

public class Main {
    public static void main(String[] args) {

        IMusteri bireyselMusteri = new BireyselMusteri();
        List<IOtomobil> bireyselOtomobilList = bireyselMusteri.otomobiller();

        System.out.println("");
        System.out.println("Bireysel müşteri olarak kiralayabileceğiniz otomobil bilgileri: ");

        for(IOtomobil otomobil : bireyselOtomobilList) {
            System.out.println("Araç modeli: " + ((OtomobilProps) otomobil).getModel());
            System.out.println("Araç yılı: " + ((OtomobilProps) otomobil).getYil());
            System.out.println("Araç rengi: " + ((OtomobilProps) otomobil).getRenk());
            System.out.println("Araç kasası: " + otomobil.getAracKasasi());
            System.out.println("Bagaj hacmi: " + ((OtomobilProps) otomobil).getBagajHacmi());
            System.out.println("Yakıt tipi: " + ((OtomobilProps) otomobil).getYakitTipi());
            System.out.println("Günlük kiralama ücreti: " + otomobil.gunlukKiralamaUcreti(1) + "₺");
            System.out.println("Aylık kiralama ücreti: " + otomobil.aylikKiralamaUcreti(1) + "₺");
        }


        /*
        IMusteri sirketMusteri = new SirketMusteri();
        List<IOtomobil> sirketOtomobilList = sirketMusteri.otomobiller();

        System.out.println("");
        System.out.println("Şirket olarak kiralayabileceğiniz otomobil bilgileri: ");
        for(IOtomobil otomobil : sirketOtomobilList) {
            System.out.println("Araç modeli: " + ((OtomobilProps) otomobil).getModel());
            System.out.println("Araç yılı: " + ((OtomobilProps) otomobil).getYil());
            System.out.println("Araç rengi: " + ((OtomobilProps) otomobil).getRenk());
            System.out.println("Araç kasası: " + otomobil.getAracKasasi());
            System.out.println("Bagaj hacmi: " + ((OtomobilProps) otomobil).getBagajHacmi());
            System.out.println("Yakıt tipi: " + ((OtomobilProps) otomobil).getYakitTipi());
            System.out.println("Günlük kiralama ücreti: " + otomobil.gunlukKiralamaUcreti(1) + "₺");
            System.out.println("Aylık kiralama ücreti: " + otomobil.aylikKiralamaUcreti(1) + "₺");
            System.out.println("");
        } */
    }
}