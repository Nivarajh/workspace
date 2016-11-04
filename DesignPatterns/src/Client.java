/**
 * Created by nijeyaku on 25/10/2016.
 */
public class Client {

    Product p;

    public Client()
    {
        ConcrateCreator c = new ConcrateCreator();
        this.p = c.createProduct();

    }

    public Client(String s)
    {
        ConcrateCreator c = new ConcrateCreator();
        this.p = c.createProduct();

    }

    public Product getProduct()
    {
        return this.p ;
    }


}
