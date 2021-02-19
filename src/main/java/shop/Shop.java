package shop;

import behaviours.ISell;
import items_for_sale.ShopItem;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }
    public void addItemToStock(ShopItem item){
        this.stock.add(item);

    }
    public void removeItemFromStock(ShopItem item){
        this.stock.remove(item);
    }
}
