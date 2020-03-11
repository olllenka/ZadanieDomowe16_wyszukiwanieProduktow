import java.util.List;

public interface SearchStrategy {
    List<Product> findByName(List<Product> allProducts, String name);
}
