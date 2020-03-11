public class Product {
    private String name;
    private double price;
    private String producer;

    public Product() {
    }

    public Product(String name, double price, String producer) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Nazwa produktu: " + name + ", cena: " + price + ", producent: " + producer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
