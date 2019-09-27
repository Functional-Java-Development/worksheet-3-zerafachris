import java.util.List;
import java.util.Optional;

public class ShoppingCart {
    private final List<Item> items;
    private final String couponCode;


    public ShoppingCart(List<Item> items, String couponCode) {
        this.items = items;
        this.couponCode = couponCode;
    }

    public List<Item> getItems() {
        return items;
    }

    public Optional<String> getCouponCode() {
        return Optional.ofNullable(couponCode);
    }
}
