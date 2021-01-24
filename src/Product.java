/**
 * Class Product gets the name, Description,price and Quantity of product
 */

public class Product{
    private String description;
    private double unit_price;
    private String name;



    /**
     * Constructor
     * @param name
     * @param description
     * @param unit_price
     */
    public Product(String name,String description, double unit_price){
        this.description = description;
        this.unit_price = unit_price;
        this.name = name;

    }

    /**
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return unit price
     */
    public double getUnit_price() {
        return unit_price;
    }

    /**
     *
     * @return gets description
     */
    public String getDescription() {
        return description;
    }

    /**
     * method to change description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * method to change the price
     * @param unit_price
     */
    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    /**
     *
     * @return object of class product as a String
     */
    @Override
    public String toString() {
        return "Product{" +", name='" + name + '\'' +
                "description='" + description + '\'' +
                ", unit_price=" + unit_price +

                '}';
    }
}

