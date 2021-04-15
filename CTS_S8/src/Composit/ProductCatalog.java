package Composit;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {
    private ArrayList<CatalogComponent> products =
            new ArrayList<CatalogComponent>();
    private String name;

    public ProductCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent component) {
        this.products.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {

        for (int i = 0; i < this.products.size(); i++)
            if (products.get(i).getName().equals(component.getName()))
                this.products.remove(i);

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Cant get price!");
    }

    @Override
    public String toString() {
        /*return "ProductCatalog{" +
                "products=" + products +
                ", name='" + name + '\'' +
                '}';*/
        StringBuilder builder = new StringBuilder();
        builder.append(this.name).append("\n");
        for (CatalogComponent component : this.products)
            builder.append(component.toString());
        return builder.toString();
    }
}
