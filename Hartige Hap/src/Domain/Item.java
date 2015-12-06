/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Jacob Walker
 */
public class Item {
    
    private String name, status, description;
    private double price;

    public Item(String name, String status, String description, double price) {
        this.name = name;
        this.status = status;
        this.description = description;
        this.price = price;
    }
    


    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
    
    public String getDescription(){
        return description;
    }

    public double getPrice() {
        return price;
    }


 
}
