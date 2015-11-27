/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.text.DecimalFormat;

/**
 *
 * @author Paramone
 */
public class Dish {
    private String name, description, type;
    private DecimalFormat price;
    
    
        
    public DecimalFormat getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getType(){
        return type;
    }
}
