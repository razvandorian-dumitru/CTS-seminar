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
            if (products.get(i).equals(component.getName()))
                this.products.remove(i);

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
