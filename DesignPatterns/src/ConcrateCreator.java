import java.util.Locale;

/**
 * Created by nijeyaku on 25/10/2016.
 */
public class ConcrateCreator implements Creator {



    @Override
    public Product createProduct() {

        Locale locale = Locale.getDefault();

        return createProduct(locale);
    }

    @Override
    public Product createCreator() {
        return null;
    }


    public Product createProduct(Locale l) {

        switch (l.getCountry())
        {
            case "fr":
                return new ConcrateProductFr();

            case "En":
                return new ConcrateProductEn();

            case "De":
                return new ConcrateProductDe();

            default:
        }

        return null;
    }
}
