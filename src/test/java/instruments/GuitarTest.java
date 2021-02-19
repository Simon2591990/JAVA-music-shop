package instruments;

import instruments.guitar.Guitar;
import instruments.guitar.GuitarType;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @org.junit.Before
    public void setUp() {
        guitar = new Guitar("Guitar",500, 750,"Fender","Black", GuitarType.ELECTRIC);

    }

    @org.junit.Test
    public void hasBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @org.junit.Test
    public void hasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @org.junit.Test
    public void hasDealerPrice() {
        assertEquals(500, guitar.getDealerPrice(), 0.01);
    }

    @org.junit.Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(750, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("The noise of stairway to heaven being butchered on guitar", guitar.play("stairway to heaven"));
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50, guitar.calculateMarkup(),0.001);
    }
}