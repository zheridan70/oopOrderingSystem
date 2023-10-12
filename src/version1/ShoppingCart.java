/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acezh
 */
public class ShoppingCart {

    //4th change this to LineItems
    //weve choosen arraylist to hold the collection of Products
    private List<LineItem> lineItems = new ArrayList<>(); //this will be error, due to LineItem class not yet created //create the class

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    //change this to add lineItems instead
//    public int getTotalCost() {
//        return products.stream()
//                .mapToInt(Product::getPrice)
//                .sum();
//    }
    
    public int getTotalCost() {
        return lineItems.stream()
                .mapToInt(LineItem::getPrice)//this will be error due to getPrice not yet created in LIneItems
                .sum();
        //goto 5th LineItems
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "lineItems=" + lineItems + '}';
    }

    

}
