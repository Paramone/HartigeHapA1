/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


/**
 *
 * @author Paramone
 */
public class Beverage extends Item {
    private double alcoholPercentage;

    public Beverage(String name, String status, String description, double price) {
        super(name, status, description, price);
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

}
