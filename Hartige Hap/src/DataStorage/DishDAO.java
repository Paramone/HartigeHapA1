/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

import Domain.Dish;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jacob Walker
 */
public class DishDAO {

    public ArrayList<Dish> getDishes() {
        ArrayList<Dish> dishes = new ArrayList<>();

        // First open a database connnection
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // If a connection was successfully setup, execute the SELECT statement.
            String sql = "SELECT * FROM dish;";
            ResultSet resultset = connection.executeSQLSelectStatement(sql);
            if (resultset != null) {
                try {
                    while (resultset.next()) {
                        int dishId = resultset.getInt("id");
                        String name = resultset.getString("name");
                        double price = resultset.getDouble("price");
                        String description = resultset.getString("description");
                        Dish newDish = new Dish(dishId, name, description, price);
                        dishes.add(newDish);
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                    dishes.clear();
                }
            }
                // else an error occurred leave array list empty.

            // We had a database connection opened. Since we're finished,
            // we need to close it.
            connection.closeConnection();
        }

        return dishes;
    }
}
