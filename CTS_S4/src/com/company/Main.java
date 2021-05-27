package com.company;

import com.company.creationale.singleton.EagerShoppingCartExample;
import com.company.creationale.singleton.ShoppingCart;

public class Main {

    public static void main(String[] args) {


        ShoppingCart myCart = ShoppingCart.getInstance();
        myCart = ShoppingCart.getInstance();

        EagerShoppingCartExample eager1 = EagerShoppingCartExample.instance;
        EagerShoppingCartExample eager2 = EagerShoppingCartExample.instance;

    }
}

