/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author acezh
 */
public class Order {
    //1st Class

    private Customer customer;
    private ShoppingCart cart;
    private Payment payment; //this will be error bec u need to create the class itself

    public Order(Customer customer, ShoppingCart cart, Payment payment) {
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" + "customer=" + customer + ", cart=" + cart + ", payment=" + payment + '}';
    }

}
