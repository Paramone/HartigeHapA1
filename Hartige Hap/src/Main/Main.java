package Main;

import Presentation.MainView;
import javax.swing.JFrame;


/**
 *
 * @author Paramone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame Launch = new MainView();
        Launch.setSize(800, 400);
        Launch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Launch.setTitle("De Hartige Hap");
        Launch.setVisible(true);
        
    }
    
}
