package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Guitar Strings",10.00, 15.00 , "Ernie Ball", 10);


    }

    @Test
    public void getBrand() {
        assertEquals("Ernie Ball", guitarStrings.getBrand());
    }

    @Test
    public void getGauge() {
        assertEquals(10, guitarStrings.getGauge());
    }

    @Test
    public void getDealerPrice() {
        assertEquals(10.00, guitarStrings.getDealerPrice(), 0.01);
    }

    @Test
    public void getSellPrice() {
        assertEquals(15, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void getMarkupPrice() {
        assertEquals(50, guitarStrings.calculateMarkup(),0.01);
    }
}