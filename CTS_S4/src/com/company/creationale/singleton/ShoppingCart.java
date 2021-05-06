package com.company.creationale.singleton;
//linia punctata inseamna ca acea clasa implementeaza interfata

import java.util.ArrayList;

// "instanta unica/globala" -> Singleton
//constructori de tip private, pt ca aceasta clasa sa nu fie instantiata
public class ShoppingCart {
    private static ShoppingCart instance;//static -> pt ca daca nu avem cum sa o instantiem, vom accesa prin numele clasei?
    public ArrayList<String> produsList;

    private ShoppingCart() {
        produsList = new ArrayList<>();
    }

    public static synchronized ShoppingCart getInstance() {
        if (instance == null)
            instance = new ShoppingCart();
        return instance;
    }

    public static void setInstance(ShoppingCart instance) {
        ShoppingCart.instance = instance;
    }
}
