package instruments;

import instruments.piano.Piano;
import instruments.piano.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steinway","Black",1200.50, PianoType.GRAND);
    }

    @Test
    public void getBrand() {
        assertEquals("Steinway", piano.getBrand());
    }

    @Test
    public void getColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void getDealerPrice() {
        assertEquals(1200.50, piano.getDealerPrice(), 0.01);
    }

    @Test
    public void getPianoType() {
        assertEquals(PianoType.GRAND, piano.getPianoType());

    }

    @Test
    public void canPlay() {
        assertEquals("The noise of Chopsticks being butchered on piano", piano.play("Chopsticks"));
    }
}