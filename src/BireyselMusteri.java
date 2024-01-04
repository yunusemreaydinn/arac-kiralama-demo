import java.util.List;

public class BireyselMusteri implements IMusteri{
    @Override
    public List<IOtomobil> otomobiller() {
        return List.of(new Hatchback("Audi A3", 300, "Beyaz", 2015, "Dizel")
        );
    }
}
