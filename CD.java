public class CD extends Product
{
    private String artist;

    public CD (String artist, double price, String name, int amountInStock)
    {
        super(price, name, amountInStock);
        this.artist = artist;
    }
}
