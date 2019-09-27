
public class Item {
    public Item(Type type, String name, float costPerUnit, float quantity) {
        this.type = type;
        this.name = name;
        this.costPerUnit = costPerUnit;
        this.quantity = quantity;
    }

    enum Type {
        ART, CONFECTIONARY, REPAIRS, PHARMACEUTICAL, GOODS
    }

    private final Type type;
    private final String name;
    private final float costPerUnit;
    private final float quantity;

    public float getCostPerUnit() {
        return costPerUnit;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Item - Type: %s, Name: %s, CostPerUnit: %.2f, Quantity: %.2f", getType(), getName(), getCostPerUnit(), getQuantity());
    }


}
