package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private static final SimpleDateFormat SIMPLE_DATE = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag(){
        return String.format("%s (Used) $ %s (Manufacture date: %s)", getName(), getPrice(), SIMPLE_DATE.format(getManufactureDate()));
    }
}
