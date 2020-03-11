import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    static List<Product> createProductListFromFile(String productFileName) throws FileNotFoundException {
        File file = new File(productFileName);
        Scanner sc = new Scanner(file);

        List<Product> products = new ArrayList<>();
        while (sc.hasNextLine()){
            String[] productLine = sc.nextLine().split(";");
            Product product = createProduct(productLine);
            products.add(product);
        }
        sc.close();
        return products;
    }

    private static Product createProduct(String[] productLine) {
        Product product = new Product();
        if(productLine.length==3) {
            product.setName(productLine[0]);
            Double priceD = Double.valueOf(productLine[1]);
            product.setPrice(priceD);
            product.setProducer(productLine[2]);
        }
        return product;
    }

}
