import musicShop.stock.Guitar;
import musicShop.stock.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Piano", "Black", "Fender", 550, 850 );
    }

    @Test
    public void hasType(){
        assertEquals("Piano", piano.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }
    @Test
    public void hasBrand(){
        assertEquals("Fender", piano.getBrand());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(550, piano.getBuyingPrice());
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(850, piano.getSellingPrice());
    }
    @Test
    public void hasOctanes(){
        assertEquals(8, piano.getNumberOfOctanes());
    }
    @Test
    public void canPlay(){
        assertEquals("You are playing the Piano", piano.play());
    }
    @Test
    public void canGetMarkupPrice(){
        assertEquals(300, piano.calculateMarkup());
    }
}

