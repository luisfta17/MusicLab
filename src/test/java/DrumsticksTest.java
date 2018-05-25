import musicShop.stock.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drumsticks", 10, 20, "oak" );
    }

    @Test
    public void hasType(){
        assertEquals("Drumsticks", drumSticks.getType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(10, drumSticks.getBuyingPrice());
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(20, drumSticks.getSellingPrice());
    }
    @Test
    public void hasStrings(){
        assertEquals("oak", drumSticks.getMaterial());
    }
    @Test
    public void canGetMarkupPrice(){
        assertEquals(10, drumSticks.calculateMarkup());
    }
}
