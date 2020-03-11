import java.util.ArrayList;
import java.util.List;

public class ExactTextSearch implements SearchStrategy {
    @Override
    public List<Product> findByName(List<Product> allProducts, String name) {
        List<Product> foundList = new ArrayList<>();
        for (Product product : allProducts) {
            if(product.getName().equals(name)){
                foundList.add(product);
            }
        }
        return foundList;
    }
}
