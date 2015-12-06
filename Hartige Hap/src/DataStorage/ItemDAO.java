package DataStorage;

import Domain.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Paramone
 */
public class ItemDAO {

    public ArrayList<Item> getBeverages(Item item) {
        ArrayList<Item> items = new ArrayList<>();

        if (item != null) {
            // First open a database connnection
            DatabaseConnection connection = new DatabaseConnection();
            if (connection.openConnection()) {
                // If a connection was successfully setup, execute the SELECT statement.
                ResultSet resultset = connection.executeSQLSelectStatement(
                        "SELECT * FROM dhh_item ");

                if (resultset != null) {
                    try {
                        while (resultset.next()) {
                            String itemName = resultset.getString("itemName");
                            String status = resultset.getString("status");
                            String description = resultset.getString("description");
                            int price = resultset.getInt("price");

                            Item newItem = new Item(itemName, status, description, price);

                            items.add(newItem);
                        }
                    } catch (SQLException e) {
                        System.out.println(e);
                        items.clear();
                    }
                }
                // else an error occurred leave array list empty.

                // We had a database connection opened. Since we're finished,
                // we need to close it.
                connection.closeConnection();
            }
        }
        return items;
    }
}
