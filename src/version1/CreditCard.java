/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author acezh
 */
public class CreditCard {

    private final long ccNumber;

    public CreditCard(long ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "ccNumber=" + ccNumber + '}';
    }

}
