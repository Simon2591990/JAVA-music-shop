package accessories;

import behaviours.ISell;

public class GuitarStrings extends Accessories {

    private int gauge;

    public GuitarStrings(String description, double dealerPrice, double sellPrice, String brand, int gauge) {
        super(description, dealerPrice, sellPrice, brand);
        this.gauge = gauge;
    }

    public int getGauge() {
        return gauge;
    }
}
