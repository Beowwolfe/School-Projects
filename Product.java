public class Product {
    
    double price;
    String name;
    int inStock;
   

    /**
     * Constructor for Product class
     * @param price the price of this product as a double
     * @param name the album name or title of this product
     * @param inStock the number of this product in stock
     */
    public Product(double price, String name, int inStock) {
        this.price = price;
        this.name = name;
        this.inStock = inStock;
      
    }

    /**
     * Getter for price field
     * @return the price of this product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for price field
     * @param price the new price of this product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for the name/title of this product
     * @return name/title of this product as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name field
     * @param name the new name/title
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for the inStock field
     * @return the amount of stock remaining for this product
     */
    public int getInStock() {
        return inStock;
    }

    /**
     * setter for instock field
     * @param inStock the new total amount of this product in stock
     */
    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
    
    
    @Override
    public String toString() {
        
        
        return name + " -$" + price;
    }
    
}
