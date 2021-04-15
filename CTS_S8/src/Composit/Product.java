package Composit;

public class Product extends CatalogComponent {
    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void add(CatalogComponent component) {
        throw new UnsupportedOperationException("Cant add product!");
    }

    @Override
    public void remove(CatalogComponent component) {
        throw new UnsupportedOperationException("Cant remove product!");

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
