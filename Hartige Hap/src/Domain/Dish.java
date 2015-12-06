package Domain;

import java.util.Date;

/**
 *
 * @author Paramone
 */
public class Dish extends Item{
    private Date preparation;

    public Dish(String name, String status, String description, double price) {
        super(name, status, description, price);
    }

    public Date getPreparation() {
        return preparation;
    }
}
