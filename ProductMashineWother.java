import java.util.List;
import java.util.ArrayList;

public class ProductMashineWother implements ProductMashine {
    List<Product> listProduct = new ArrayList<Product>();

    public void initProducts(List<Product> listProd) {
        this.listProduct = listProd;

    }

    public Product geProduct(String name) {
        for (Product prod : listProduct) {
            if (prod.getName().equals(name));
                return prod;

        }
        return null;
    }

}