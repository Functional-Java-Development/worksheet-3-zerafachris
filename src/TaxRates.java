import java.util.Map;

public class TaxRates {
    public static Float getTaxRate(Item.Type itemType) {
        return taxes.getOrDefault(itemType, 0.18f);

    }

    private static final Map<Item.Type, Float> taxes = Map.of(
            Item.Type.ART, 0.05f,
            Item.Type.CONFECTIONARY, 0.06f,
            Item.Type.REPAIRS, 0.075f,
            Item.Type.PHARMACEUTICAL, 0.0f,
            Item.Type.GOODS, 0.18f);


}
