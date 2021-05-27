package cts.ase.ro.clase;

import cts.ase.ro.MarketingStrategyInterface;

import java.util.Random;

public class RandomMarketingStrategy implements MarketingStrategyInterface {


    @Override
    public double calculateBonus(double base) {
        return (new Random().nextInt(100)) * base;
    }
}
