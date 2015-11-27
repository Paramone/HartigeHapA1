/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Presentation.DrinkView;
import Presentation.MainView;
import java.awt.Panel;
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
