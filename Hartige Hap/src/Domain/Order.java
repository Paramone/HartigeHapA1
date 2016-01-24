/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class Order {
    private ArrayList<Dish> order;
    private double totalPrice;
    
    public Order()
    {
        order = new ArrayList<Dish>();
        totalPrice = 0.0;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
    public void addToOrder(Dish newDish)
    {
        order.add(newDish);
    }
}
