/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

import java.util.UUID;

/**
 *
 * @author acezh
 */
class Payment {

    private CreditCard creditCard;
    private UUID transactionId;
    private int value;

    public Payment(CreditCard creditCard, int value, UUID transactionId) {
        this.creditCard = creditCard;
        this.transactionId = transactionId;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" + "creditCard=" + creditCard + ", transactionId=" + transactionId + ", value=" + value + '}';
    }

}
