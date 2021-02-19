package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items_for_sale.ShopItem;

import static java.lang.StrictMath.round;

public abstract class Instrument extends ShopItem implements IPlay, ISell{

    private String brand;
    private String colour;

    public Instrument(String description, double dealerPrice, double sellPrice, String brand, String colour) {
        super(description, dealerPrice, sellPrice);
        this.brand = brand;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }





}
