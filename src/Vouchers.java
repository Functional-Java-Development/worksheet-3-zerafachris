import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Vouchers {
    private static List<Voucher> vouchers = List.of(
            new Voucher("10% off €50 or more", "10POFF50E", 0.1f, invoice -> invoice.getTotalCost() >= 50),
            new Voucher("5% off 10 items or more", "5POFF10I", 0.05f, invoice -> invoice.getTotalItems() >= 10)
    );
    private static Map<String, Voucher> vouchersMap = vouchers.stream().collect(Collectors.toMap(Voucher::getCode,
            voucher -> voucher));

    public static Optional<Voucher> getVoucher(String code){
        return Optional.ofNullable(vouchersMap.get(code));
    }

}
