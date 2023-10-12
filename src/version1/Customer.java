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
public class Customer {

    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long ccNumber) {
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }
    //3rd,. create the checkout method
    
      public Optional<Order> checkout(ShoppingCart cart){
//    public Order checkout(ShoppingCart cart){
        Optional<Payment> payment = creditCard.mkPayment(cart.getTotalCost());
        //return new Order(this, cart, payment.get()); //we have to create an order based on the payment,
                                                                  //payment.get() to get payment but this is dangerous
                                                                  //it can produce an error if the payment is empty
                                                                  //guard with a test,
//        return payment.isPresent() ? new Order(this, cart, payment.get()) : null; //but now we are back to returning null
                                                                                                //so we need to be consistent in returning ang empty.optional
          //return payment.isPresent() ? Optional.of(new Order(this, cart, payment.get())) : Optional.empty();
          
          //this can be changed to a funcational style of expression using lambda.
          return payment.map(value -> new Order(this, cart, value));//the lambda here takes a payment and produces an Order from it
                                                                                   //but that map method, only applies the lambda if the payment is not empty
                                                                                   //if the payment is empty it just returns an empty optional
          //goto 4th,. -> ShoppingCart
                                                                                                
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", creditCard=" + creditCard + '}';
    }

}
