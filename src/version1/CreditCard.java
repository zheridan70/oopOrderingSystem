/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author acezh
 */
public class CreditCard {

    private final long ccNumber;

    public CreditCard(long ccNumber) {
        this.ccNumber = ccNumber;
    }

    //2nd since credit card transaction can fail, let us simulate the process
    //give it a 70% chance of success
//    public Payment mkPayment(int value) {
//        if(Math.random() > 0.3) {
//            return new Payment(this, value, UUID.randomUUID());
//        } else {
//            return null;
//        }
//the above code needs to be changed to the bottom
//Java8 gave us the use of Optionals, specifically an EmptyOptional
    public Optional<Payment> mkPayment(int value) {
        if (Math.random() > 0.3) {
            return Optional.of(new Payment(this, value, UUID.randomUUID()));
        } else {
            return Optional.empty();
        }
//after changing to optional,. goto 3rd ->checkout method in Customer
    }

    @Override
    public String toString() {
        return "CreditCard{" + "ccNumber=" + ccNumber + '}';
    }

}
