import java.io.FileNotFoundException;
import java.util.List;

public class ProductRepository{
    private List<Product> productList;
    private final SearchStrategy searchStrategy;

    public ProductRepository(SearchStrategy searchStrategy, String productFileName) {
        this.searchStrategy = searchStrategy;
        try {
            this.productList = FileReader.createProductListFromFile(productFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku: " + productFileName);
        }
    }

    public List<Product> findByName (String name){
        return searchStrategy.findByName(productList, name);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
