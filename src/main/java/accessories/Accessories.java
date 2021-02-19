package accessories;

import behaviours.ISell;
import items_for_sale.ShopItem;

public abstract class Accessories extends ShopItem implements ISell {
    private String brand;

    public Accessories(String description, double dealerPrice, double sellPrice, String brand) {
        super(description, dealerPrice, sellPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double calculateMarkup(){
        double markup =  ((this.getSellPrice() - this.getDealerPrice()) / this.getDealerPrice()) * 100;

        markup = markup * 100;
        markup = Math.round(markup);
        markup = markup / 100;
        return markup;
    }
}
