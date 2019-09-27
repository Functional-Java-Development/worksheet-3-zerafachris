import java.util.function.Predicate;

public class Voucher {
    private final String description;
    private final String code;
    private final float discount;
    private final Predicate<Invoice> applyVoucher;

    public Voucher(String description, String code, float discount, Predicate<Invoice> applyVoucher) {
        this.description = description;
        this.code = code;
        this.discount = discount;
        this.applyVoucher = applyVoucher;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public float getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return String.format("Voucher - Code: %s, Disc: %.2f, Desc: %.s", getCode(), getDiscount(), getDescription());
    }

    public Invoice apply(Invoice invoice) {
        if (applyVoucher.test(invoice)) {
            return new Invoice(invoice.getTotalCost() * (1f - getDiscount()), invoice.getTotalTax() * (1f - getDiscount()), invoice.getTotalItems());
        }
        return invoice;
    }

}
