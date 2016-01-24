/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Business.HartigeManager;
import DataStorage.DatabaseConnection;
import Domain.Dish;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author Walker
 */
public class HartigeGUI extends JFrame{
    
    HartigeManager manager;
    Dish selectedDish;
    
    public HartigeGUI(final HartigeManager manager)
    {
        super("Bestellen");
        this.manager = manager;
        this.setSize(1300, 300);
        
        //WEST
        JLabel orderLabel = new JLabel("Kies uw gerecht");
        final JComboBox orderCombo = new JComboBox(manager.getAllDishNames().toArray());
        selectedDish = manager.getDishForName(orderCombo.getSelectedItem().toString());
        JButton addButton = new JButton("Voeg toe");
        
        final JLabel descriptionLabel = new JLabel(String.format("Beschrijving: %s", selectedDish.getDescription()));
        final JLabel priceLabel = new JLabel(String.format("Prijs: €%s", selectedDish.getPrice()));
        
        JPanel addPanel = new JPanel();
        addPanel.add(orderLabel);
        addPanel.add(orderCombo);
        addPanel.add(addButton);
        addPanel.add(descriptionLabel);
        addPanel.add(priceLabel);
        
        this.getContentPane().add(addPanel, BorderLayout.WEST);
        
        //EAST
        JLabel totalLabel = new JLabel("Toegevoegde gerechten");
        final JTextPane totalPane = new JTextPane();
        totalPane.setPreferredSize(new Dimension(200, 200));
        JButton orderButton = new JButton("Bestel");
        
        JPanel orderPanel = new JPanel();
        orderPanel.add(totalLabel);
        orderPanel.add(totalPane);
        orderPanel.add(orderButton);
        
        this.getContentPane().add(orderPanel, BorderLayout.EAST);
        
        //SOUTH
        JLabel priceShow = new JLabel("Totaal: €");
        final JLabel totalPrice = new JLabel("00.00");
        JPanel pricePanel = new JPanel();
        pricePanel.add(priceShow);
        pricePanel.add(totalPrice);
        this.getContentPane().add(pricePanel, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        //ACTION HANDLERS BABY
        
        orderCombo.addActionListener (new ActionListener () 
        {
            public void actionPerformed(ActionEvent e) 
            {
                selectedDish = manager.getDishForName(orderCombo.getSelectedItem().toString());
                descriptionLabel.setText(String.format("Beschrijving: %s", selectedDish.getDescription()));
                priceLabel.setText(String.format("Prijs: €%s", selectedDish.getPrice()));
            }
        });
        
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                totalPane.setText(totalPane.getText() + manager.addToOrder(selectedDish));
                totalPrice.setText(String.format("Prijs: €%.2f", manager.getOrderPrice()));
            }
        });
        
        orderButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                DatabaseConnection connection = new DatabaseConnection();
                if (connection.openConnection() == false)
                {
                    totalPrice.setText("FALSE");
                }
            }
        });
    }
}
