package com.company;

public interface IFly {
    public default void fly() {
        System.out.println("FLY");
    }

}
