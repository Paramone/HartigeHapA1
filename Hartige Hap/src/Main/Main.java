package Main;

import Presentation.MainView;
import Presentation.StartView;
import javax.swing.JFrame;

/**
 *
 * @author Paramone
 */
public class Main extends JFrame {

    public static void main(String[] args) {       
        JFrame Launch = new JFrame();
        Launch.setSize(800, 400);
        Launch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Launch.setContentPane(new StartView(Launch));
        Launch.setTitle("De Hartige Hap");
        Launch.setVisible(true);        
    }
}
