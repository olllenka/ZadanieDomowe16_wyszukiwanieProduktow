import java.util.ArrayList;
import java.util.List;

public class PartialTextSearch implements SearchStrategy {
    @Override
    public List<Product> findByName(List<Product> allProducts, String name) {
        List<Product> foundList =  new ArrayList<>();
        for (Product product : allProducts) {
            if(product.getName().contains(name)){
                foundList.add(product);
            }
        }
        return foundList;
    }
}
