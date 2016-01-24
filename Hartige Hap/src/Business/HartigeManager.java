/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DataStorage.DishDAO;
import DataStorage.OrderDAO;
import Domain.Dish;
import Domain.Order;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class HartigeManager {

    private ArrayList<Dish> allDishes;
    private Order newOrder;

    public HartigeManager() {
        newOrder = new Order();
        DishDAO dishDAO = new DishDAO();
        allDishes = dishDAO.getDishes();
    }

    public String addToOrder(Dish newDish) {
        newOrder.addToOrder(newDish);
        newOrder.setTotalPrice(newOrder.getTotalPrice() + newDish.getPrice());

        return "Toegevoegd:\n" + newDish.getName() + "\n" + newDish.getDescription() + "\n\n";
    }

    public double getOrderPrice() {
        return newOrder.getTotalPrice();
    }

    public void addDish(Dish newDish) {
        allDishes.add(newDish);
    }

    public ArrayList<Dish> getAllDishes() {
        return allDishes;
    }

    public Dish getDishForName(String dishName) {
        for (Dish newDish : allDishes) {
            if (newDish.getName().equals(dishName)) {
                return newDish;
            }
        }
        return null;
    }

    public ArrayList<String> getAllDishNames() {
        ArrayList<String> allNames = new ArrayList<String>();
        for (Dish newDish : allDishes) {
            allNames.add(newDish.getName());
        }
        return allNames;
    }

    public void saveOrder() {
        OrderDAO orderDAO = new OrderDAO();
        orderDAO.saveOrder(newOrder);
    }
}
