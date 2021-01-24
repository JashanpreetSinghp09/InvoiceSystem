/**
 * Class Address gets the full address of the Customer/buyer
 */

public class Address{
    private String name,street,city,province,postal_code;

    public Address(String name,String street,String city,String province,String postal_code){
        this.name = name;
        this.street = street;
        this.city = city;
        this.postal_code = postal_code;
        this.province = province;

    }

    /**
     *
     * @return format string
     */
    @Override
    public String toString() {
        return "Address = " + name +  ","+
                " " + street +
                "," + city +
                ", " + province +
                " " + postal_code ;

    }
}