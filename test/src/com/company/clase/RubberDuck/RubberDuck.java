package com.company.clase.RubberDuck;

import com.company.Duck;
import com.company.IFly;

public class RubberDuck extends Duck implements IFly {
    @Override
    public void quack() {
        System.out.println("RubberDuck");
    }
    }
