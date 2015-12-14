package Presentation;

/**
 *
 * @author Paramone
 */
public class DrinkView extends javax.swing.JFrame {

    public DrinkView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        drinkMainInfo = new javax.swing.JLabel();
        drink1 = new java.awt.Label();
        drink2 = new java.awt.Label();
        drink3 = new java.awt.Label();
        drink4 = new java.awt.Label();
        drink5 = new java.awt.Label();
        increaseDrink1 = new javax.swing.JButton();
        increaseDrink2 = new javax.swing.JButton();
        increaseDrink3 = new javax.swing.JButton();
        increaseDrink4 = new javax.swing.JButton();
        increaseDrink5 = new javax.swing.JButton();
        drinkAmount1 = new java.awt.Label();
        drinkAmount2 = new java.awt.Label();
        drinkAmount3 = new java.awt.Label();
        drinkAmount4 = new java.awt.Label();
        drinkAmount5 = new java.awt.Label();
        decreaseDrink1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("Terug");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        drinkMainInfo.setText("Hier kunt u drinken selecteren en toevoegen aan uw bestelling");

        drink1.setText("Coca Cola");

        drink2.setText("Coca Cola Light");

        drink3.setText("Fanta");

        drink4.setText("Sprite");

        drink5.setText("Ice Tea");

        increaseDrink1.setText("+");
        increaseDrink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseDrink1ActionPerformed(evt);
            }
        });

        increaseDrink2.setText("+");

        increaseDrink3.setText("+");

        increaseDrink4.setText("+");

        increaseDrink5.setText("+");

        drinkAmount1.setText("0");

        drinkAmount2.setText("0");

        drinkAmount3.setText("0");

        drinkAmount4.setText("0");

        drinkAmount5.setText("0");

        decreaseDrink1.setLabel("-");
        decreaseDrink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseDrink1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinkMainInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(increaseDrink5)
                                    .addComponent(increaseDrink4)
                                    .addComponent(increaseDrink3)
                                    .addComponent(increaseDrink2)
                                    .addComponent(increaseDrink1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(drinkAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(decreaseDrink1))
                                    .addComponent(drinkAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drinkAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drinkAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drinkAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drinkMainInfo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseDrink1)
                    .addComponent(drinkAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decreaseDrink1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseDrink2)
                    .addComponent(drinkAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseDrink3)
                    .addComponent(drinkAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseDrink4)
                    .addComponent(drinkAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseDrink5)
                    .addComponent(drinkAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );

        drink1.getAccessibleContext().setAccessibleName("drink1");
        drink2.getAccessibleContext().setAccessibleName("drink2");
        drink3.getAccessibleContext().setAccessibleName("drink3");
        drink4.getAccessibleContext().setAccessibleName("drink4");
        drink5.getAccessibleContext().setAccessibleName("drink5");
        increaseDrink1.getAccessibleContext().setAccessibleName("drinkButton1");
        increaseDrink2.getAccessibleContext().setAccessibleName("drinkButton2");
        increaseDrink3.getAccessibleContext().setAccessibleName("drinkButton3");
        increaseDrink4.getAccessibleContext().setAccessibleName("drinkButton4");
        increaseDrink5.getAccessibleContext().setAccessibleName("drinkButton5");
        decreaseDrink1.getAccessibleContext().setAccessibleName("decreaseDrink1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        //Go back to Main View
    }//GEN-LAST:event_backButtonActionPerformed

    private void increaseDrink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseDrink1ActionPerformed
        int amount = Integer.parseInt(drinkAmount1.getText());
        amount++;
        drinkAmount1.setText(Integer.toString(amount));
    }//GEN-LAST:event_increaseDrink1ActionPerformed

    private void decreaseDrink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseDrink1ActionPerformed
        int amount = Integer.parseInt(drinkAmount1.getText());
        if(amount > 0){
            amount--;
        }
        drinkAmount1.setText(Integer.toString(amount));
    }//GEN-LAST:event_decreaseDrink1ActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DrinkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrinkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrinkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrinkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrinkView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton decreaseDrink1;
    private java.awt.Label drink1;
    private java.awt.Label drink2;
    private java.awt.Label drink3;
    private java.awt.Label drink4;
    private java.awt.Label drink5;
    private java.awt.Label drinkAmount1;
    private java.awt.Label drinkAmount2;
    private java.awt.Label drinkAmount3;
    private java.awt.Label drinkAmount4;
    private java.awt.Label drinkAmount5;
    private javax.swing.JLabel drinkMainInfo;
    private javax.swing.JButton increaseDrink1;
    private javax.swing.JButton increaseDrink2;
    private javax.swing.JButton increaseDrink3;
    private javax.swing.JButton increaseDrink4;
    private javax.swing.JButton increaseDrink5;
    // End of variables declaration//GEN-END:variables
}
