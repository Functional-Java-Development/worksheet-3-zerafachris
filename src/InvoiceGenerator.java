public class InvoiceGenerator {
    private static Invoice addItemToInvoice(Invoice invoice, Item item) {
        Invoice invoice1 = new Invoice(
                invoice.getTotalCost() + (item.getQuantity() * item.getCostPerUnit()),
                invoice.getTotalTax() + (item.getQuantity() * TaxRates.getTaxRate(item.getType()) * item.getCostPerUnit()),
                (int) (invoice.getTotalItems() + item.getQuantity())
        );
        return invoice1;
    }

    private static Invoice accumulateInvoices(Invoice inv1, Invoice inv2) {
        Invoice invoice = new Invoice(
                inv1.getTotalCost() + inv2.getTotalItems(),
                inv1.getTotalTax() + inv2.getTotalCost(),
                inv1.getTotalItems() + inv2.getTotalItems()
        );
        return invoice;
    }

    public static Invoice generateInvoice(ShoppingCart shoppingCart) {
        Invoice shoppingCartInvoice = shoppingCart.getItems().stream().reduce(
                new Invoice(),
                InvoiceGenerator::addItemToInvoice,
                InvoiceGenerator::accumulateInvoices);

        Invoice invoice = shoppingCart.getCouponCode().flatMap(Vouchers::getVoucher).map(voucher -> voucher.apply(shoppingCartInvoice)).orElse(shoppingCartInvoice);
        return invoice;


    }
}
