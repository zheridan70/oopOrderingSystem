/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author acezh
 */
class LineItem {
    //5th LineItems
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "LineItem{" + "product=" + product + ", quantity=" + quantity + '}';
    }
    
    public int getPrice() {
        return product.price * quantity; //change to this new value of price
        int price = (int) (product.price * (100 - product.discount) /100.0);
        //return price * quantity;
        // in this system design,. if we try to cahnge how price is computed, then all the other class that uses the price varliable also has to change.
        //SOLUTION: is to encapslate the get price method int he Product class
        //we can change to price that we want or how it is calculated
        //int get price,. change to this
        //return (int) (product.price * (100 - product.discount) /100.0)
        //if the realated data is only on LineITem, now other program needs to chagne
        //now the price also changed,. now we factor-in shipping cost
        
    }
    
    //3rd,.. after Product
    //change to directly get the price
    
}
