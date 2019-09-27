import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> items = Collections.unmodifiableList(new ArrayList<Item>() {{
            add(new Item(Item.Type.CONFECTIONARY, "Cake", 3.5f, 1));
            add(new Item(Item.Type.CONFECTIONARY, "Flour", 0.8f, 2.5f));
            add(new Item(Item.Type.ART, "Painting", 100.0f, 2));
            add(new Item(Item.Type.GOODS, "TV", 350.0f, 1));
            add(new Item(Item.Type.PHARMACEUTICAL, "Paracetamol", 2.1f, 4));
            add(new Item(Item.Type.REPAIRS, "Computer Repair", 35.0f, 1));
        }});

//        items.forEach(x -> System.out.println(TaxRates.getTaxRate(x.getType()).toString() + ' ' + x.toString()));


        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items, null)));
        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items, "10POFF50E")));
        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items, "5POFF10I")));
        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items, "12312412")));


        List<Item> items2 = Collections.unmodifiableList(new ArrayList<Item>() {{
//            add(new Item(Item.Type.CONFECTIONARY, "Cake", 3.5f, 1));
            add(new Item(Item.Type.CONFECTIONARY, "Flour", 0.8f, 2.5f));
//            add(new Item(Item.Type.ART, "Painting", 100.0f, 2));
//            add(new Item(Item.Type.GOODS, "TV", 350.0f, 1));
            add(new Item(Item.Type.PHARMACEUTICAL, "Paracetamol", 2.1f, 4));
            add(new Item(Item.Type.REPAIRS, "Computer Repair", 35.0f, 1));
        }});
        System.out.println("Excluding Cake, Painting, TV:");
        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items2, null)));
        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items2, "10POFF50E")));
        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items2, "5POFF10I")));
        System.out.println(InvoiceGenerator.generateInvoice(new ShoppingCart(items2, "12312412")));

    }
}
