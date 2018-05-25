package musicShop.stock;

public class Piano extends Instrument {

    private int numberOfOctanes;
    public Piano(String type, String colour, String brand, int buyingPrice, int sellingPrice){
        super(type, colour, brand, buyingPrice, sellingPrice);
        this.numberOfOctanes = 8;
    }

    public int getNumberOfOctanes() {
        return this.numberOfOctanes;
    }

    public void setNumberOfOctanes(int numberOfOctanes) {
        this.numberOfOctanes = numberOfOctanes;
    }
}
