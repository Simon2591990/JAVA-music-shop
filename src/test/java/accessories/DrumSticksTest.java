package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() {
        drumSticks = new DrumSticks("Drum Sticks", 8.00,10.00,"Vic Firth","5A");
    }

    @Test
    public void getBrand() {
        assertEquals("Vic Firth", drumSticks.getBrand());
    }

    @Test
    public void getDealerPrice() {
        assertEquals(8, drumSticks.getDealerPrice(),0.01);
    }

    @Test
    public void getSellPrice() {
        assertEquals(10, drumSticks.getSellPrice(),0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(25, drumSticks.calculateMarkup(),0.01);
    }

    @Test
    public void getSize() {
        assertEquals("5A", drumSticks.getSize());
    }
}