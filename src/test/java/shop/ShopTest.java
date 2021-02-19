package shop;

import accessories.DrumSticks;
import behaviours.ISell;
import instruments.guitar.Guitar;
import instruments.guitar.GuitarType;
import instruments.piano.Piano;
import instruments.piano.PianoType;
import items_for_sale.ShopItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Piano piano;
    DrumSticks drumSticks;
    ArrayList<ISell> stock;

    @Before
    public void setUp()  {
        drumSticks = new DrumSticks("Drum Sticks", 8.00,10.00,"Vic Firth", "5A");
        guitar = new Guitar("Guitar",500, 750,"Fender","Black", GuitarType.ELECTRIC);
        piano = new Piano("Piano",1200.50, 1500,"Steinway","Black", PianoType.GRAND);
        stock = new ArrayList<ISell>();
        stock.add(guitar);
        stock.add(piano);
        shop = new Shop(stock);
    }

    @Test
    public void getStock() {
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void addItemToStock() {
        shop.addItemToStock(drumSticks);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void removeItemFromStock() {
        shop.removeItemFromStock(piano);
        assertEquals(1, shop.getStock().size());
    }
}