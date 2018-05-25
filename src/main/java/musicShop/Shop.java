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
    public void addExhibition(IPlay instrument){
        this.exhibition.add(instrument);
    }
    public int findItemIndexInStock(ISell iSell){
        return this.stock.indexOf(iSell);
    }

    public void addMoney(int amount){
        this.till += amount;
    }

    public void sellItem(ISell iSell, Customer customer){
        this.addMoney(iSell.getSellingPrice());
    }

}
