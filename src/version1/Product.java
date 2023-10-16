/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author acezh
 */
public class Product {

    private final String name; //
    private int price; // change this to below
    //int price;
    private ProductType type; //add this
    private int discount; // add this
    private int weight; // add this

    public Product(String name, int price, ProductType type, int weight) { //chagne this
        this.name = name;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }

    public int getPrice() {
        return price; //remove this for demo .. goto LIne ITEM
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", ProductType=" + type + ", Weight=" + weight + '}'; //change this
    }

    //supposed by mistake we disgned the Product without a getter method for Price. and get the Price directly. go to change price
    //
    
}
