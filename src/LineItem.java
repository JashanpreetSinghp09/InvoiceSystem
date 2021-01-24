/**
 * Class LineItem gets the object of class Product as a product and its Quantity
 */
public class LineItem{

    private int quantity;
    private Product product;

    public LineItem(Product product,int quantity){
        this.quantity = quantity;
        this.product = product;
    }

    /**
     *
     * @return the Amount to pay in total
     */
    public double getTotalPrice(){
        double total = product.getUnit_price()*quantity;
        return total;
    }

    /**
     * to display all the instance variablesv bnnnb n bn
     * @return a String format
     */
    public String format(){
        return String.format("%-32s%-21s%9.2f%6d%9.2f",product.getName(),product.getDescription(),product.getUnit_price(),quantity,getTotalPrice());
    }
}