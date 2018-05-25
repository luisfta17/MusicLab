import musicShop.Customer;
import musicShop.Shop;
import musicShop.stock.DrumSticks;
import musicShop.stock.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Customer customer;
    Piano piano;
    DrumSticks drumSticks;

    @Before
    public void before(){
        shop = new Shop();
        drumSticks = new DrumSticks("Drumsticks", 10, 20, "oak" );
        piano = new Piano("Piano", "Black", "Fender", 550, 850 );
        customer = new Customer("Luis", 1000);
    }

    @Test
    public void hasTill(){
        assertEquals(0, shop.getTill());
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStock().size());
    }
    @Test
    public void hasExhibition(){
        assertEquals(0, shop.getExhibition().size());
    }
    @Test
    public void canAddStock(){
        shop.addStock(piano);
        assertEquals(1, shop.getStock().size());
    }
    @Test
    public void canAddExhibition(){
        shop.addExhibition(piano);
        assertEquals(1, shop.getExhibition().size());
    }
    @Test
    public void canGetPotentialProfit(){
        shop.addStock(piano);
        shop.addStock(drumSticks);
        assertEquals(2, shop.getStock().size());
        assertEquals(310, shop.potentialProfit());
    }

    @Test
    public void canSellItem(){
        shop.addStock(piano);
        shop.addStock(drumSticks);
        shop.sellItem(piano, customer);
        assertEquals(1, shop.getStock().size());
        assertEquals(850, shop.getTill());
        assertEquals(150, customer.getWallet());
        assertEquals(1, customer.getInstruments().size());
    }

}
