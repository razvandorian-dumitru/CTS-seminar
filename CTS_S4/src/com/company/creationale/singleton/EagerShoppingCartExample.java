package com.company.creationale.singleton;

public class EagerShoppingCartExample {
    public static final EagerShoppingCartExample instance;

    static {
        instance = new EagerShoppingCartExample();
    }

    private EagerShoppingCartExample() {
    }
}