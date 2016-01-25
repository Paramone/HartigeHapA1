package Main;

import Business.HartigeManager;
import Presentation.HartigeGUI;

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
