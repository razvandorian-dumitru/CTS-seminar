package com.company;

import Composit.CatalogComponent;
import Composit.Product;
import Composit.ProductCatalog;
import Decorator.*;
import Facade.OrderFacade;

public class Main {

    public static void main(String[] args) {
        // FACADE -> pt logare?
        //tip structural
        //ascunde parti cu care userul nu ar trebui sa interactioneze
        //complex/complexitate ->factory-> ascunde complexitatea
        //Facade->ascunde complexitatea sistemului

        //Composite -> structura ierarhica
        //Componenta abstracta din care extindem obiectul composite
        //nod frunza->componenta abstracta


        //Decorator - > extinderea comportamentului reflectat prin metode, la nivel de obj
        //daca am o colectie e altceva
        OrderFacade facade = new OrderFacade();
        facade.order();
        System.out.println("----------------------------------------");

        CatalogComponent laptop = new Product("Asus", 2000);
        CatalogComponent smartPhone = new Product("Samsung S20", 3500);
        CatalogComponent techProductsCatalog = new ProductCatalog("Tech");
        techProductsCatalog.add(laptop);
        techProductsCatalog.add(smartPhone);

        CatalogComponent paperclip = new Product("Paperclip", 5);
        CatalogComponent pen = new Product("Pen", 2);
        CatalogComponent officeProductCatalog = new ProductCatalog("Office");
        officeProductCatalog.add(paperclip);
        officeProductCatalog.add(pen);

        CatalogComponent genericProducts = new ProductCatalog("Generic");
        genericProducts.add(new Product("Test", 0));
        genericProducts.add(techProductsCatalog);
        genericProducts.add(officeProductCatalog);

        System.out.println(genericProducts.toString());

        System.out.println("----------------------------------------");
        AbstractBackpack myBackpack = new Backpack();
        myBackpack.pack();
        AbstractBackpack decoratedBackpack = new WithLaptopDecorator(new WithFoodDecorator(myBackpack, "banana"));
        decoratedBackpack.pack();
    }
}
