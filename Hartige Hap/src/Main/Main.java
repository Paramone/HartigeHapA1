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
public class Main {

    public static void main(String[] args) {
        HartigeManager manager = new HartigeManager();
        HartigeGUI gui = new HartigeGUI(manager);
    }
}
