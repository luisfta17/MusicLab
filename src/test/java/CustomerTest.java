import musicShop.Customer;
import musicShop.stock.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Piano piano;
    Customer customer;
    @Before
    public void before(){
        piano = new Piano("Piano", "White", "Fender", 100, 150);
        customer = new Customer("Luis", 500);
    }

    @Test
    public void hasName(){
        assertEquals("Luis", customer.getName());
    }

    @Test
    public void hasWallet(){
        assertEquals(500, customer.getWallet());
    }

    @Test
    public void canAddInstrument(){
        customer.addItemToInstrument(piano);
        assertEquals(1, customer.getInstruments().size());
    }
}
