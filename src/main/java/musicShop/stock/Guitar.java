package musicShop.stock;

public class Guitar extends Instrument {

    private int numberOfStrings;
    public Guitar(String type, String colour, String brand, int buyingPrice, int sellingPrice){
        super(type, colour, brand, buyingPrice, sellingPrice);
        this.numberOfStrings = 6;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
