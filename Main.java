package GroceryShopping;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    /**
     * The method displays the array of menus
     * @param menu - Product object
     */
    public static void showMenu(Product[] menu){
        for (int i = 0; i < menu.length ; i++) {
            System.out.println("Produsul nr." + (i+1) + " " +menu[i].displayProduct());
        }
    }

    /**
     * Basically everything you need to do with the cart.
     * Add prodcuts, list them, total amount calculated and pay
     */
    public static void listOfGroceries(Product[] menu){
        System.out.println("How many products would you like to purchase: ");
        int numberofproducts = in.nextInt();
        Product[] productsinbasket = new Product[numberofproducts];
        Cart basket = new Cart(productsinbasket, numberofproducts);
        basket.addToCard(basket.dimension,menu);
        showMenu(productsinbasket);
        basket.getTotalamounttopay();
        basket.payTotalAmount();
    }

    /**
     * Initialize the menu
     * each step in the while adds a product in the array of menus
     * @param menu - we all know now what this guys is
     */
    public static void initMenu(Product[] menu){
        int i = 0;
        while(i<menu.length){
            System.out.print("Da-ti produsul nr. " + (i+1) + " :");
            String produs = in.nextLine();
            System.out.print("Da-ti pretul acestui produs: ");
            int price = in.nextInt();
            menu[i] = new Product(produs,price);
            in.nextLine();
            i++;
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        Product[] menu = new Product[5];
        initMenu(menu);
        showMenu(menu);
        listOfGroceries(menu);
    }

}
