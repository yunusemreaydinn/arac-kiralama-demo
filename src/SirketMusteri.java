import java.util.Arrays;
import java.util.List;

public class SirketMusteri implements IMusteri{

    @Override
    public List<IOtomobil> otomobiller() {
        return Arrays.asList(
                new Sedan("Ford Focus", 350, "Beyaz", 2023, "Benzin"),
                new SUV("Nissan Qashqai", 400, "Siyah", 2018, "Benzin", 1.2),
                new Hatchback("Audi A3", 300, "Beyaz", 2015, "Dizel")
        );
    }
}
