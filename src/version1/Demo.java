/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

import java.util.Optional;

/**
 *
 * @author acezh
 */
public class Demo {
    public static void main(String[] args) {
        //Create the Catalogue static class
        
        ShoppingCart cart = new ShoppingCart();
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        
        cart.addLineItem(new LineItem(toothbrush, 1));//chagne this to LIneitem
        cart.addLineItem(new LineItem(babyAlarm, 1));
        
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
        //run and check\
        
        //create customer
        Customer john = new Customer("Jhon", 123456789L);
        Optional<Order> order = john.checkout(cart);
        System.out.println(order);
        //run / check
        
        //version4 start demo here
        //encapsulation is to isolate changes to a signle component
        //think of possible way on how the system might change
        //example is the appearance of new product type
        //goto v4_2nd Product Linetiems
        //changes to the way how price are calculated
        
    }
}
