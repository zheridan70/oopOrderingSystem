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

    //weve choosen arraylist to hold the collection of Products
    private List<Product> products = new ArrayList<>();
    
    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalCost() {
        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "products=" + products + '}';
    }

}
