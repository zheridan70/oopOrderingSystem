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
        ShoppingCart cart = new ShoppingCart();
        Product toothbrush = new Product("Electric Toothbrush", 3550);
        Product babyAlarm = new Product("Baby Alarm", 4999);
        
        cart.addProduct(toothbrush);
        cart.addProduct(babyAlarm);
        
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
        
        

            

            
            

        
    }
}
