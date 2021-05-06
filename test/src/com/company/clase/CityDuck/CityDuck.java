package com.company.clase.CityDuck;

import com.company.Duck;
import com.company.IFly;

public class CityDuck extends Duck implements IFly {
    @Override
    public  void quack() {
        System.out.println("CityDuck");
    }
}
