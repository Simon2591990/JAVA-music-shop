package instruments;

import instruments.guitar.Guitar;
import instruments.guitar.GuitarType;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @org.junit.Before
    public void setUp() {
        guitar = new Guitar("Fender","Black",900, GuitarType.ELECTRIC);

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
        assertEquals(900, guitar.getDealerPrice(), 0.01);
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
    public void canPlay() {
        assertEquals("The noise of stairway to heaven being butchered on guitar", guitar.play("stairway to heaven"));
    }
}