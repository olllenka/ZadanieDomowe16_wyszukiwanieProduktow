public class Main {
    public static void main(String[] args) {

        ExactTextSearch exactSearch = new ExactTextSearch();
        PartialTextSearch partialSearch = new PartialTextSearch();
        String fileName = "products.txt";

        ProductRepository prodRepo1 = new ProductRepository(exactSearch, fileName);
        ProductRepository prodRepo2 = new ProductRepository(partialSearch, fileName);

        findProductByName(prodRepo1, "czekolada");
        findProductByName(prodRepo2, "czekolada");

    }

    private static void findProductByName(ProductRepository prodRepo, String name) {
        System.out.println("Wyszukiwanie dla nazwy: \"" + name + "\"\npasujące produkty: " + prodRepo.findByName(name));
    }
}
