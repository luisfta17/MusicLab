import musicShop.stock.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar", "Black", "Fender", 250, 350 );
    }

    @Test
    public void hasType(){
        assertEquals("Guitar", guitar.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", guitar.getColour());
    }
    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(250, guitar.getBuyingPrice());
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(350, guitar.getSellingPrice());
    }
    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
    @Test
    public void canPlay(){
        assertEquals("You are playing the Guitar", guitar.play());
    }
    @Test
    public void canGetMarkupPrice(){
        assertEquals(100, guitar.calculateMarkup());
    }
}
