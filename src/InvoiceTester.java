public class InvoiceTester {

    public static void main(String[] args) {
        Address jason_address = new Address("Jason","Alex Ave","Windsor","ON","N9b 1G3");

        Invoice jason_invoice = new Invoice(jason_address);

        jason_invoice.addLineItems(new Product("IPHONE XS","SMARTPHONE",1400),1,2);
        jason_invoice.addLineItems(new Product("Airpods","Apple Airpods",200.00),2,1);

        System.out.println(jason_invoice.format());

        Product p = new Product("MacBook","Laptop",2700);
// tests the set methods of product class
        p.setDescription("Gaming Console");
        p.setUnit_price(550);

        System.out.println(p);
    }
}
