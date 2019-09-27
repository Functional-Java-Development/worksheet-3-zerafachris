public class Invoice {
    private final Float totalCost;
    private final Float totalTax;
    private final Integer totalItems;

    public Invoice(Float totalCost, Float totalTax, Integer totalItems) {
        this.totalCost = totalCost;
        this.totalTax = totalTax;
        this.totalItems = totalItems;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public Float getTotalTax() {
        return totalTax;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public Float getGrandTotal() {
        return totalCost + totalTax;
    }

    public Invoice() {
        this.totalCost = 0f;
        this.totalTax = 0f;
        this.totalItems = 0;
    }

    @Override
    public String toString() {
        return String.format("Invoice - Items: %d, Cost: %.2f, Tax: %.2f, GrantTotal: %.2f",
                getTotalItems(), getTotalCost(), getTotalTax(), getGrandTotal());
    }
}
