package GroceryShopping;

import java.util.Scanner;

public class Cart {
    /**
     * Parameter dimension allows us to set the dimension of the array of products needed to store the products in the
     * cart. For now I chose a to use a Product object but a most efficient way to store and add products was to use
     * a list of products. It could help to add again products after the first shopping session.
     * Members dimension
     */
    public static Scanner in = new Scanner(System.in);
    public int dimension;
    private Product[] products;

    /**
     * Constructor of the class Cart
     * @param products
     * @param dimension
     */
    public Cart(Product[] products, int dimension) {
        this.dimension = dimension;
        this.products = products;
    }

    /**
     * Int return type method used for returning the total amount from the basket
     */
    public int getTotalamounttopay(){
        int i = 0;
        int totalamounttopay = 0;
        while(i<dimension) {
            totalamounttopay += products[i].price;
            i++;
        }
        return totalamounttopay;
    }

    /**
     * Choosing products to add in to the basket
     * @param dimension
     * @param menu
     */
    public void addToCard(int dimension, Product[] menu){
        int i = 0;
        int optiune;
        System.out.println();
        while(i<dimension){
            System.out.print("Choose a product!");
            optiune = in.nextInt();
            optiune-=1;
            if(optiune < 5 && optiune >= 0) {
                products[i] = menu[optiune];
                i++;
            }else{
                System.out.print("Choose a product from 1 to 5!");
            }
        }
    }

    /**
     * Someone has to pay the total amount calculated in the above method
     */
    public void payTotalAmount(){
        boolean h = true;
        System.out.println("Total amount is " + getTotalamounttopay());
        int topay = in.nextInt();
        while(h){
            if(getTotalamounttopay() == topay){
                h = false;
                System.out.println("Thank you for your purchase! Bye");
            }else{
                System.out.println("Pay the right amount or I'll call the police!");
                topay = in.nextInt();
            }
        }
    }
}
