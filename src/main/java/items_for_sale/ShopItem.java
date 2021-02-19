package items_for_sale;

import behaviours.ISell;

public abstract class ShopItem implements ISell {

    private double dealerPrice;
    private double sellPrice;
    private String description;

    public ShopItem(String description, double dealerPrice, double sellPrice) {
        this.description = description;
        this.dealerPrice = dealerPrice;
        this.sellPrice = sellPrice;
    }

    public double getDealerPrice() {
        return dealerPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double calculateMarkup(){
        double markup =  ((this.sellPrice - dealerPrice) / dealerPrice) * 100;

        markup = markup * 100;
        markup = Math.round(markup);
        markup = markup / 100;
        return markup;

    }

}
