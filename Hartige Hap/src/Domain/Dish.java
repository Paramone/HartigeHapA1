/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Walker
 */
public class Dish {
    private String name;
    private String description;
    private double price;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    
    public Dish(String name, String description, double price)
    {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString()
    {
        return name + ", (" + description + "), " + price;
    }
}
