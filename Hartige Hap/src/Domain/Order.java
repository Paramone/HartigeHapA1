/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;

/**
 *
 * @author Jacob Walker
 */
public class Order {
    private int orderNumber;
    private String paymentStatus;
    private Date orderDateTime;

    public Order(int orderNumber, String paymentStatus, Date orderDateTime) {
        this.orderNumber = orderNumber;
        this.paymentStatus = paymentStatus;
        this.orderDateTime = orderDateTime;
    }

    
    
    public int getOrderNumber() {
        return orderNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public Date getOrderDateTime() {
        return orderDateTime;
    }
    
    
    
}
