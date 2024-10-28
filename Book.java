public class Book extends Product
{
    private String author;
    
    public Book(String author, double price, String name, int amountInStock)
    {
        super(price,name,amountInStock);
        this.author = author;
    }
}
