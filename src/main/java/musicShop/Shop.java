package musicShop;

import musicShop.stock.IPlay;
import musicShop.stock.ISell;
import musicShop.stock.Instrument;

import java.util.ArrayList;

public class Shop {
    private ArrayList<IPlay> exhibition;
    private ArrayList<ISell> stock;
    private int till;

    public Shop(){
        this.exhibition = new ArrayList<>();
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public ArrayList<IPlay> getExhibition() {
        return this.exhibition;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }
    public void addStock(ISell iSell){
        this.stock.add(iSell);
    }
    public void removeStock(ISell iSell){
        this.stock.remove(iSell);
    }
    public void addExhibition(IPlay instrument){
        this.exhibition.add(instrument);
    }

    public void addMoney(int amount){
        this.till += amount;
    }

    public void sellItem(ISell iSell, Customer customer){
        if (customer.getWallet() >= iSell.getSellingPrice()){
            this.addMoney(iSell.getSellingPrice());
            customer.removeMoneyFromWallet(iSell.getSellingPrice());
            customer.addItemTobag(iSell);
            this.removeStock(iSell);
        }
    }

    public int potentialProfit(){
        int total = 0;
        for (ISell iSell : this.getStock()){
            total += iSell.calculateMarkup();
        }
        return total;
    }

}
