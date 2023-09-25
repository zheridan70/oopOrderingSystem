/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

import java.util.Map;

/**
 *
 * @author acezh
 */
public class Catalogue {
    
    //this will create a product map using the Map.of function under Java9
    private static Map<String, Product> productMap = Map.of(
                "Electric Toothbrush", new Product("Electric Toothbrush", 3550),
                "Baby Alarm", new Product("Baby Alarm", 4999)
    );
    
    //If you dont have java9, you can use a static initialiazer like this below
    
//    static {
//        productMap.put("Electric Toothbrush", new Product("Electric Toothbrush", 3550));
//        productMap.put("Baby Alarm", new Product("Baby Alarm", 4999));
//    }

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }

}
