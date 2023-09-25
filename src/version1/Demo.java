/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

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
        
        cart.addProduct(toothbrush);
        cart.addProduct(babyAlarm);
        
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
        
    }
}
