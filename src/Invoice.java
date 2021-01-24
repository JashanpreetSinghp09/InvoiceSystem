import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Invoice method contains info about billing address and methods to add items
 */
public class Invoice{
    private Address buyer_address;
    private ArrayList<LineItem>items;
    private Boolean inStock = true;
    private int quantity_in_stock;


    /**
     *
     * @param add
     */
    public Invoice(Address add){
        items = new ArrayList<>();
        this.buyer_address =  add;
    }

    /**
     * adds the product into the Arraylist of type LineItem
     * @param product
     * @param quantity
     * @param available_quantity
     * checks if product is in stock otherwise sets boolean InStock to false
     */
    public void addLineItems(Product product,int quantity,int available_quantity){
        LineItem item = new LineItem(product,quantity);
        this.quantity_in_stock = available_quantity;
        if(quantity<this.quantity_in_stock&& this.quantity_in_stock>0){
        items.add(item);}else {
            this.inStock = false;
        }
    }

    /**
     * Decreases the quantity in stock
     * @param quantity_in_stock
     */
    public void setQuantity_in_stock(int quantity_in_stock) {
        this.quantity_in_stock -= quantity_in_stock;
    }

    /**
     * gets the total amount for the invoice
     * @return due amount
     */
    public double getDueAmount(){
        double amount_due = 0;

        for(LineItem i: items){
            amount_due += i.getTotalPrice();
        }

        return amount_due;
    }


    /**
     * Formats the String
     * @return
     */
    public String format() {
         String str = " ----INVOICE------\n"+ buyer_address.toString()+"\n" ;


         for(LineItem i: items){
             str = str + i.format()+ "\n";
         }

         str += String.format("\nAmount Due  : %30.2f",getDueAmount());

         return str;
    }
}










