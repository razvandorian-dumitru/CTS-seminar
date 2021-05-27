package cts.ase.ro.clase;

import cts.ase.ro.MarketingStrategyInterface;

public class ModulMarketing {
    private MarketingStrategyInterface currentStrategy;

    public double getBonus(double base) {

        if (currentStrategy != null)
            return currentStrategy.calculateBonus(base);
        else throw new UnsupportedOperationException("EXCEPTIE");
    }

    public void setCurrentStrategy(MarketingStrategyInterface currentStrategy) {
        this.currentStrategy = currentStrategy;
    }
}
