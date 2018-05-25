package musicShop;

import musicShop.stock.ISell;
import musicShop.stock.Instrument;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private ArrayList<ISell> bag;

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<ISell> getInstruments() {
        return bag;
    }
    public int getWallet() {
        return wallet;
    }
    public void removeMoneyFromWallet(int amount){
        this.wallet -= amount;
    }
    public void addItemToInstrument(ISell instrument){
        this.bag.add(instrument);
    }
}
