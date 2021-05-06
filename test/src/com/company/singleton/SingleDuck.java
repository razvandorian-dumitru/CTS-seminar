package com.company.singleton;

public class SingleDuck {
    private static SingleDuck instance;

    private SingleDuck() {
        System.out.println("single");
    }

    public static SingleDuck getInstance() {
        if (instance == null) {
            instance = new SingleDuck();
            System.out.println("null");
        } else System.out.println("NON null");
        return instance;

    }

}
