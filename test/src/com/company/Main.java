package com.company;

import com.company.clase.CityDuck.CityDuck;
import com.company.clase.CityDuck.CityDuckToy;
import com.company.clase.RubberDuck.RubberDuck;
import com.company.clase.RubberDuck.RubberDuckReal;
import com.company.singleton.SingleDuck;

import java.security.cert.CertificateParsingException;

public class Main {

    public static void main(String[] args) {

        CityDuck cityDuck = new CityDuck();
        CityDuckToy cityDuckToy = new CityDuckToy();

        RubberDuck rubberDuck = new RubberDuck();
        RubberDuck rubberDuckReal = new RubberDuckReal();

        SingleDuck singleDuck = SingleDuck.getInstance();
        SingleDuck singleDuck1 = SingleDuck.getInstance();
    }
}
