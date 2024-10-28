import java.util.*;
public class Main {

    public static void main(String[] args) {
        

        Bookstore bookStore = new Bookstore();
        
        Scanner scnr = new Scanner(System.in);
        
        boolean run = true;
        
        while(run) {
        
            System.out.println("Welcome to the automated BookStore System!");
            System.out.println("Select from one of the following options:");
            System.out.println("\t1. Examine our selection");
            System.out.println("\t2. XXXXX");
            System.out.println("\t3. XXXXX");
            System.out.println("\t4. Exit");
            int choice = 0;
            
            choice = scnr.nextInt();
           
            switch(choice){
                case 1:
                    System.out.println("Which type of product are you searching for today?");
                    System.out.println("Please enter\n\t1 - for Books\n\t2 - for CDs\n\t3-for DVDs");
                    int selection = scnr.nextInt();

                    // Follow along with the comments to complete your code
                    int counter = 0;
                    ArrayList<Product> productList = new ArrayList<Product>();
                    // If the user chose Books
                        // Loop through the objects in the inventory ArrayList from Bookstore
                        // Count the number of book objects in the Arraylist
                    if (selection == 1)
                    {
                        for (int i = 0; i < bookStore.getInventory().size(); i++)
                        {
                            if (bookStore.getInventory().get(i) instanceof Book)
                            {
                                counter++;
                                productList.add(bookStore.getInventory().get(i));
                            }
                        }
                        System.out.println("There are " + counter + " different books currently available for purchase!");
                        System.out.println(productList);
                    }
                   
                    // Or, if the user chose CDs
                        // Loop through the objects in the inventory ArrayList from Bookstore
                        // Count the number of CD objects in the Arraylist
                    if (selection == 2)
                    {
                        for (int i = 0; i < bookStore.getInventory().size(); i++)
                        {
                            if (bookStore.getInventory().get(i) instanceof CD)
                            {
                                productList.add(bookStore.getInventory().get(i));
                                counter++;
                            }
                        }
                        System.out.println("There are " + counter + " different CDs currently available for purchase!");
                        System.out.println(productList);
                        
                    }

                    // Or, if the user chose DVDs
                        // Loop through the objects in the inventory ArrayList from Bookstore
                        // Count the number of DVD objects in the Arraylist
                    if (selection == 3)
                    {
                        for (int i = 0; i < bookStore.getInventory().size(); i++)
                        {
                            if (bookStore.getInventory().get(i) instanceof DVD)
                            {
                                counter++;
                                productList.add(bookStore.getInventory().get(i));

                            }
                        }
                        System.out.println("There are " + counter + " different DVDs currently available for purchase!");
                        System.out.println(productList);
                    }
                    
                    // Finally, show the user how many different products of their chosen type are available for purchase
                        // For example
                        // "There are 5 different books currently available for purchase!"
                        // Then, print each of the objects of that type (Hint: You were given a toString method inside the Product class)
                        
                    break;
                case 2:
                    System.out.println("Sorry, this feature is NYI");
                    break;
                case 3:
                    System.out.println("Sorry, this feature is NYI");
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input, try again.");
            }            
        }
            
    }

}
