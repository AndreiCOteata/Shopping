package GroceryShopping;

public class Product {
    /**
     * Product class members
     */
    private String productname;
    public int price;

    /**
     * Constructor of the Product class
     * @param productname - name of the product of your choice
     * @param price - price for that product
     */
    public Product(String productname, int price){
        this.productname= productname;
        this.price = price;
    }

    /**
     * displays the product name and it's price
     * @return
     */
    public String displayProduct(){
        return productname + " are pretul " + price + " lei!";
    }
}

