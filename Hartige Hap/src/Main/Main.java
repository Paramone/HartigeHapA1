package Main;

import Business.HartigeManager;
import Domain.Dish;
import Presentation.HartigeGUI;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Walker
 */
public class Main{

    public static void main(String[] args) {  
       HartigeManager manager = new HartigeManager();
       
       Dish Pizza = new Dish("Pizza", "Heerlijke kaas pizza met ananas, appels, peren en GFT afval.", 7.99);
       Dish HappyMeal = new Dish("Happy Meal", "Een happy-de-peppie maaltijdje.", 12.00);
       Dish Water = new Dish("Water", "Bronwater met een na-smaak van accuzuur.", 1.00);
       Dish Havermout = new Dish("Havermout", "Een flink bord havermout.", 0.50);
       Dish VanilleIjs = new Dish("Vanille Ijs", "Toetje.", 2.00);
        
       manager.addDish(Pizza);
       manager.addDish(HappyMeal);
       manager.addDish(Water);
       manager.addDish(Havermout);
       manager.addDish(VanilleIjs);
       
       HartigeGUI gui = new HartigeGUI(manager);
    }
}
