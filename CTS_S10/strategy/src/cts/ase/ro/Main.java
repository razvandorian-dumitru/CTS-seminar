package cts.ase.ro;

import cts.ase.ro.clase.ModulMarketing;
import cts.ase.ro.clase.RandomMarketingStrategy;

public class Main {

    public static void main(String[] args) {
        ModulMarketing modulMarketing = new ModulMarketing();
        modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());

        double puncteBonus = modulMarketing.getBonus(100);
        System.out.println(puncteBonus);

        modulMarketing.setCurrentStrategy(new RandomMarketingStrategy() {
            @Override
            public double calculateBonus(double base) {
                return 30 * base;
            }
        });

        puncteBonus = modulMarketing.getBonus(100);
        System.out.println(puncteBonus);
        modulMarketing.setCurrentStrategy(base -> {
            return 20 * base;
        });


    }
}
