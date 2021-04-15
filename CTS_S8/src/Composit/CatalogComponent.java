package Composit;

public abstract class CatalogComponent {
    public abstract void add(CatalogComponent component);

    public abstract void remove(CatalogComponent component);

    public abstract String getName();

    public abstract double getPrice();
}