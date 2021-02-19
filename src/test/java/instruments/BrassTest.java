package instruments;

import instruments.brass.Brass;
import instruments.brass.BrassType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrassTest {
    Brass brass;

    @Before
    public void setUp() throws Exception {
        brass = new Brass("Brass",1000, 2000,"Yamaha","brass", BrassType.TRUMPET);

    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", brass.getBrand());
    }

    @Test
    public void getColour() {
        assertEquals("brass", brass.getColour());
    }

    @Test
    public void getDealerPrice() {
        assertEquals(1000, brass.getDealerPrice(), 0.01);
    }

    @Test
    public void getBrassType() {
        assertEquals(BrassType.TRUMPET, brass.getBrassType());
    }

    @Test
    public void getSellPrice() {
        assertEquals(2000, brass.getSellPrice(),0.01);
    }

    @Test
    public void play() {
        assertEquals("the sound of The Mexican Hat Dance can be heard. Toot toot ", brass.play("The Mexican Hat Dance"));
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100, brass.calculateMarkup(),0.01);
    }
}