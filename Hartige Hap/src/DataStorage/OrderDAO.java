/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

import Domain.Dish;
import Domain.Order;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jacob Walker
 */
public class OrderDAO {

    public int saveOrder(Order newOrder) {
        int orderId = getNextOrderId();
        // First open a database connnection
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // If a connection was successfully setup, execute the SELECT statement.

            String sql = "";
            double totalPrice = 0;
            // Save the dishes of our order
            for (Dish orderDish : newOrder.getAllDishes()) {
                sql = "INSERT INTO order_dish(order_id, dish_id) VALUES( ";
                sql += orderId + ",";
                sql += orderDish.getId() + ");";
                connection.executeSQLUpdateStatement(sql);

                // Add to the total order price
                totalPrice += orderDish.getPrice();
            }

            // TODO generate total price of all dishes
            sql = "INSERT INTO `order`(id, status, totalprice) VALUES ('" + orderId + "', 'placed', '" + totalPrice + "')";
            connection.executeSQLUpdateStatement(sql);

            // We had a database connection opened. Since we're finished,
            // we need to close it.
            connection.closeConnection();
        }
        return orderId;

    }

    public int getNextOrderId() {
        int nextId = 0;
        // First open a database connnection
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // If a connection was successfully setup, execute the SELECT statement.                
            ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT id FROM `order` ORDER BY id DESC LIMIT 1");

            if (resultset != null) {
                try {
                    while (resultset.next()) {
                        nextId = resultset.getInt("id");
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            // We had a database connection opened. Since we're finished,
            // we need to close it.
            connection.closeConnection();
        }
        nextId += 1;
        return nextId;
    }
}
