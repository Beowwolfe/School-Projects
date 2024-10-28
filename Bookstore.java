import java.util.*;
public class Bookstore {
    
    ArrayList<Product> inventory = new ArrayList<Product>();


    /**
     * Constructor. Calls helper methods that generate arraylists of products and members
     */
    public Bookstore() 
    {
        
        generateInventory();
  
    }
    
    
    
    
    private void generateInventory() {
    
        Book book1 = new Book("Harper Lee", 9.99, "To Kill A Mockingbird",5);
        Book book2 = new Book("E.B. White", 7.99, "Charlotte's Web", 7);
        CD cd1 = new CD("Lizzo", 7.99, "Cuz I Love You", 5);
        DVD dvd1 = new DVD(15.99, "How To Train Your Dragon", 3);
        
        inventory.add(book1);
        inventory.add(book2);
        inventory.add(cd1);
        inventory.add(dvd1);
      
        
  
    }

    


    /**
     * getter for inventory
     * @return arraylist of Products
     */
    public ArrayList<Product> getInventory() {
        return inventory;
    }

  
    
    
    
    
    
}
